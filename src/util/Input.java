package util;

import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public Input(){
    }

    public String getString(){
        System.out.println("Please enter a string");
        return scanner.next();
    }

    public boolean yesNo(){
        System.out.println("Please enter either Yes, or No");
        String msg = scanner.next();
        msg = msg.toLowerCase();
        return msg.equals("y") || msg.equals("yes");
    }

    public int getInt(int min, int max) {
        int inputInt = 0;
        while (inputInt > max || inputInt < min) {
            System.out.printf("Please enter a number between %d and %d%n", min, max);
            inputInt = scanner.nextInt();
        }
        return inputInt;
    }

    public int getInt2(){
        System.out.println("Please enter a number.");
        return scanner.nextInt();
    }

    public int getInt(){
        return Integer.parseInt(scanner.nextLine());
    }

    public double getDouble(double min, double max){
        double inputDouble = 0.0;
        while (inputDouble > max || inputDouble < min) {
            System.out.printf("Please enter a double between %.2f and %.2f%n",min, max);
            inputDouble = scanner.nextDouble();
        }
        return inputDouble;
    }

    public double getDouble(){
        System.out.println("Please enter a double type number");
        return scanner.nextDouble();
    }
}
