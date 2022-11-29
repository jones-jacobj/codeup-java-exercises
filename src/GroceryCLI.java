import java.util.HashMap;
import java.util.Scanner;

public class GroceryCLI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, GroceryItem> groceryList = new HashMap<>();
        System.out.println("Hello!");
        System.out.println("Would you like to make a Grocery List?");
        String choose = input.next();
        if (choose.equalsIgnoreCase("y") || choose.equalsIgnoreCase("yes")){
            System.out.println("Okay! Let's make a new Grocery List.");
            boolean makingGroceryList = true;
            while (makingGroceryList) {
                System.out.println("What is the name of the item you wish to add to your Grocery List?");
                String itemName = input.next();
                System.out.println("Okay, how many of this item would you like to get?");
                int itemCount = input.nextInt();
                System.out.println("Okay, what category would you like to add this item to?");
                String itemCategory = input.next();
                System.out.printf("Okay, so you'd like to get %d %s?\n", itemCount, itemName);
                choose = input.next();
                if(choose.equalsIgnoreCase("y") || choose.equalsIgnoreCase("yes")){
                    System.out.printf("Okay, added %d of %s to your Grocery list\n", itemCount, itemName);
                    groceryList.put(itemName, new GroceryItem(itemName,itemCount,itemCategory));
                }else{
                    System.out.println("Goodbye!");
                    makingGroceryList = false;
                }
                System.out.println(groceryList);
            }
        }else{
            System.out.println("Okay! Goodbye!");
        }
    }
}
