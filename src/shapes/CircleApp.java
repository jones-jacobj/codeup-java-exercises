package shapes;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a radius for a circle");
        Double radius = input.nextDouble();
        Circle c1 = new Circle(radius);
        System.out.println(String.format("With an area of %.2f the circumference is %.2f and the area is %.2f", radius, c1.getCircumference(), c1.getArea()));
    }
}
