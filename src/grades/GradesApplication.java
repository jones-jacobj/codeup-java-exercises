package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        boolean running = true;
        Scanner s1 = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();
        students.put("zgulde",new Student("Zach"));
        students.get("zgulde").addGrade2(92).addGrade2(86).addGrade2(75);
        students.put("ryanorsinger",new Student("Ryan"));
        students.get("ryanorsinger").addGrade2(93).addGrade2(84).addGrade2(81);
        students.put("jreich5",new Student("Jared"));
        students.get("jreich5").addGrade2(95).addGrade2(91).addGrade2(85);
        students.put("fmendozaro",new Student("Fred"));
        students.get("fmendozaro").addGrade2(91).addGrade2(81).addGrade2(79);
        students.put("MontealegreLuis",new Student("Luis"));
        students.get("MontealegreLuis").addGrade2(87).addGrade2(88).addGrade2(73);
        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");
        System.out.println("|zgulde| |ryanorsinger| |jreich5| |fmendozaro| |MontealegreLuis|");
        while(running){
            System.out.println("What student would you like to see more information on?");
            String input = s1.next();
            if (students.containsKey(input)){
                System.out.printf("Name: %s - GitHub Username: %s%n",students.get(input).getName(),input);
                System.out.printf("Current Average %.2f \n",students.get(input).getGradeAverage());
            }else{
                System.out.printf("No student named %s was found",input);
            }
            System.out.println("Would you like to search for another student?");
            input = s1.next();
            if (input.toLowerCase().equals("y") || input.toLowerCase().equals("yes")){
                continue;
            }else {
                System.out.println("Goodbye!");
                running = false;
            }
        }
    }
}
