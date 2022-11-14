import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        int luckyNumber = rnd.nextInt(100);
        int guess = 0;
        System.out.println("I have chosen a random number between 1 and 100; please try and guess it!");
        while(guess != luckyNumber){
            System.out.println("What is your guess?");
            guess = input.nextInt();
            if(guess == luckyNumber){
                System.out.println("Good guess!");
            }else if(guess < luckyNumber){
                System.out.println("You're too low, the number is higher.");
            }else{
                System.out.println("You're too high, the number is lower.");
            }
    }
}
}