package util;

import java.io.IOError;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Please enter a string");
        String msg = scanner.next();

        return msg;
    }

    public boolean yesNo(){
        System.out.println("Please enter either Yes, or No");
        String msg = scanner.next();
        msg = msg.toLowerCase();
        if (msg.equals("y") || msg.equals("yes")){
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        int inputInt = 0;
        while (inputInt > max || inputInt < min) {
            System.out.println(String.format("Please enter a number between %d and %d", min, max));
            inputInt = scanner.nextInt();
        }
        return inputInt;
    }

    public int getInt(){
        System.out.println("Please enter a number.");
        int inputInt = scanner.nextInt();

        return inputInt;
    }

    public double getDouble(double min, double max){
        double inputDouble = 0.0;
        while (inputDouble > max || inputDouble < min) {
            System.out.println(String.format("Please enter a double between %.2f and %.2f",min, max));
            inputDouble = scanner.nextDouble();
        }
        return inputDouble;
    }

    public double getDouble(){
        System.out.println("Please enter a double type number");
        double inputDouble = scanner.nextDouble();

        return  inputDouble;
    }
}
