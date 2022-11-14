import java.util.Random;
import java.util.Scanner;

public class MethodsExercise {

    public static int Addition(int num1, int num2){
        return num1 + num2;
    }

    public static int Subtraction(int num1, int num2){
        return num1 - num2;
    }

    public static int Multiplication(int num1, int num2){
        return num1 * num2;
    }

    public static int Multiplication2(int num1, int num2){
        int total = 0;
        for (int i=0; i<num2; i++){
            total += num1;
        }
        return total;
    }

    public static int Division(int num1, int num2){
        return num1 / num2;
    }

    public static int Modulus(int num1, int num2){
        return num1 % num2;
    }

    // public static void inRange(){
    //     Scanner sc = new Scanner(System.in);
    //     boolean numberInRange = false;
    //     while(!numberInRange){
    //         System.out.println("Please enter a number between 1 and 20");
    //         int input = sc.nextInt();
    //         if(input >= 1 && input <= 20){
    //             System.out.println(String.format("The number you entered %d is between 1 and 20!",input));
    //             break;
    //         }
    //     }
    // }

    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        boolean numberInRange = false;
        int number = 0;
        while(!numberInRange){
            System.out.println(String.format("Please enter a number between %d and %d", min, max));
                int input = sc.nextInt();
                if (input >= min && input <= max){
                    return input;
                }
        }

        return number;
    }

    public static long factoral(){
        long i, fact = 1;
        Scanner sc = new Scanner(System.in);
        while (fact == 1){
            System.out.println("Please enter a number between 1 and 10 to see it's factoral");
            int number = sc.nextInt();
            if (number >= 1 && number <= 10){
                for (i=1; i<= number; i++){
                    fact = fact * i;
                }
                return fact;
            }
        }
        return 0;
    }

    public static void diceRolling(){
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        boolean running = true;
        while(running){
            System.out.println("Please enter the number of sides you want the dice to have");
            int sides = sc.nextInt();
            int dice1 = rn.nextInt(sides);
            int dice2 = rn.nextInt(sides);
            // System.out.println("Please enter to roll your dice!");
            // sc.nextLine();
            System.out.println(String.format("You rolled %d and %d totalling %d", dice1, dice2, (dice1+dice2)));
            System.out.println("Would you like to roll more dice?");
            String input2 = sc.next();
            if (!input2.equals("y") || !input2.equals("yes")){
                    running = false;
                }
            }
            System.out.println("Goodbye!");
        }

    public static void main(String[] args) {
        // System.out.println(Multiplication(5, 3));
        // System.out.println(Multiplication2(5, 3));
        // System.out.println(String.format("The number %d is between the min and max!",getInteger(1,30)));
        // System.out.println(factoral());
        diceRolling();
    }
}
