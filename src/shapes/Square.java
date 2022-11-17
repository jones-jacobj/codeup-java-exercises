package shapes;

public class Square extends Quadrilateral{
    public Square(double side){
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    public double getArea(){
        return this.length * this.length;
    }

    @Override
    public void setLength(double newLength) {
        this.length=newLength;
    }

    @Override
    public void setWidth(double newWidth) {
        this.width=newWidth;
    }
}
