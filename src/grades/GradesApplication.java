package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        boolean running = true;
        Scanner s1 = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();
        students.put("zgulde",new Student("Zach"));
        students.get("zgulde").addGrade2(95).addGrade2(86).addGrade2(75).addGrade2(92);
        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");
        System.out.println("|zgulde| |ryanorsinger| |jreich5| |fmendozaro| |MontealegreLuis|");
        System.out.println("What student would you like to see more information on?");
        while(running){
            System.out.println(students.get("zgulde").getGradeAverage());
            String input = s1.next();
            running = false;
            System.out.println(String.format("Name: %s - GitHub Username: %s",students.get(input),students.get(input)));
        }
    }
}
