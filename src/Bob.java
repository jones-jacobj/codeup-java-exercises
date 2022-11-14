import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        Scanner scanin = new Scanner(System.in);
        boolean talking = true;
        while(talking){
            System.out.println("What would youlike to say to Bobby?");
            String response = scanin.nextLine();
            if((response.substring(response.length()-1).equals("?"))){
                System.out.println("Bobby: Sure");
            }
            else if((response.substring(response.length()-1).equals("!"))){
                System.out.println("Bobby: Whoa, chill out!");
            }
            else if(response.trim().length() < 1){
                System.out.println("Bobby: Fine. Be that way!");
                talking = false;
            }
            else{
                System.out.println("Bobby: Whatever.");
            }
            }
        }
    }
