import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // int i = 5;
        // while (i <= 15) {
        //     System.out.println(i);
        //     i++;
        // }
        // int i = 100;
        // do {
        //     System.out.println(i);
        //     i -= 5;
        // }while(i >= -10);
        // for (int i=100; i>= -10; i-=5){
        //     System.out.println(i);
        // }
        // double i = 2;
        // do {
        //     System.out.println(i);
        //     i = Math.pow(i,2);
        // }while(i < 1000000);
        // for (double i=2; i<1000000; i=Math.pow(i,2)){
        //     System.out.println(i);
        // }

        // FizzBuzz
        // for(int i=0; i<=100; i++){
        //     if (i%3==0 && i%5==0){
        //         System.out.println("FizzBuzz");
        //     }
        //     else if(i%3==0){
        //         System.out.println("Fizz");
        //     }
        //     else if(i%5==0){
        //         System.out.println("Fizz");
        //     }
        //     else{
        //         System.out.println(i);
        //     }
        // }

        boolean cont = true;
        Scanner input = new Scanner(System.in);
        while(cont == true){
            System.out.println("Please enter a whole number");
            int in1 = input.nextInt();
            System.out.println("Number | Squared | Cubed");
            for (int i=1; i<=in1; i++){
                System.out.printf("%5d | %5d | %5d%n",i,(int)Math.pow(i,2),(int)Math.pow(i,3));
            }
            System.out.println("Would you like to enter another number? [y,n]");
            String response = input.next();
            if (response.equalsIgnoreCase("n")){
                cont = false;
            }
        }
        System.out.println("GOODBYE!");
    }

    
}
