package util;

public class InputTest {
    public static void main(String[] args) {
        Input i1 = new Input();

        // Enter Integer
        try {
            System.out.println("Please enter a Integer!");
            int test = i1.getInt();
            System.out.printf("The integer you entered was %d", test);
        } catch (Exception NumberFormatException){
            System.out.println("That was not an integer");
        }

        //Enter Double
        try {
            System.out.println("Please enter a Double!");
            double test = i1.getDouble();
            System.out.printf("The integer you entered was %.2f", test);
        } catch (Exception NumberFormatException){
            System.out.println("That was not an Double");
        }
    }
}
