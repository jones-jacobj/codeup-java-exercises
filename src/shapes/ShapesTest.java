package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;
        Measurable myShape1;

        myShape = new Square(10.0);
        myShape1 = new Rectangle(10.0,8.0);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape1.getArea());
        System.out.println(myShape1.getPerimeter());
    }
}
