package movies;

import java.util.Scanner;

import static movies.MoviesArray.findAll;

public class MoviesApplication {
    public static void main(String[] args) {
        boolean running = true;
        Scanner scanin = new Scanner(System.in);
        while(running){
            System.out.println("Would you like to \n1:]View all the movies \n2:]View movies in Animated category \n3:]View movies in Drama category \n4:]View movies in Horror category \n5:]View movies in SciFi category \nAny other key to quit");
            int choice = scanin.nextInt();
            switch (choice){
                case 1:
                    for (Movie movie : findAll()){
                        System.out.println(movie.getName());
                    }
                    break;
                case 2:
                    for (Movie movie : findAll()){
                        if(movie.getCategory().toLowerCase() == "animated"){
                            System.out.println(movie.getName());
                        }
                    }
                    break;
                case 3:
                    for (Movie movie : findAll()){
                        if(movie.getCategory().toLowerCase() == "drama"){
                            System.out.println(movie.getName());
                        }
                    }
                    break;
                case 4:
                    for (Movie movie : findAll()){
                        if(movie.getCategory().toLowerCase() == "horror"){
                            System.out.println(movie.getName());
                        }
                    }
                    break;
                case 5:
                    for (Movie movie : findAll()){
                        if(movie.getCategory().toLowerCase() == "scifi"){
                            System.out.println(movie.getName());
                        }
                    }
                    break;
                default:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
            }
        }
    }
}
