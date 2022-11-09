import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        // double pi = 3.14159;
        // System.out.printf("The value of pi is approximately %.2f", pi);
        // System.out.println("Please input an integer");
        // int input1 = input.nextInt();
        // System.out.printf("You input %d", input1);
        // System.out.println("Please enter three words seperated by spaces.");
        // String inputString = input.next();
        // String inputString2 = input.next();
        // String inputString3 = input.next();
        // System.out.printf("The words you entered were %s then %s then %s",inputString,inputString2,inputString3);
        // String inputString = input.nextLine();
        // System.out.printf("The words you entered were %s",inputString);
        System.out.println("Please enter the length of the room you are in:");
        int inputLength = input.nextInt();
        System.out.println("Please enter the width of the room you are in:");
        int inputWidth = input.nextInt();
        System.out.printf("The perimiter of that room is %d and the area is %d",((inputLength*2)+(inputWidth*2)),(inputLength*inputWidth));
    }
}
