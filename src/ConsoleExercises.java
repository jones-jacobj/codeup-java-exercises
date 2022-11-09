import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // double pi = 3.14159;
        // System.out.printf("The value of pi is approximately %.2f", pi);
        // System.out.println("Please input an integer");
        // int input1 = input.nextInt();
        // System.out.printf("You input %d", input1);
        String[] words = new String[3];
        System.out.println("Please enter three words seperated by spaces.");
        String inputString = input.next();
        String inputString2 = input.next();
        String inputString3 = input.next();
        System.out.printf("The words you entered were %s then %s then %s",inputString,inputString2,inputString3);
    }
}
