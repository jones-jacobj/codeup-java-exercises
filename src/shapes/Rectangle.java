package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width){
        super(length,width);
    }

    public void setLength(double newLength){this.length=newLength;}
    public void setWidth(double newWidth){this.width=newWidth;}

    @Override
    public double getPerimeter() {
        return (2 * this.length + 2 * this.width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
}
