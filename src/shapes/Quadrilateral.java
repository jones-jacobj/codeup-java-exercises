package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double length, width;

    public Quadrilateral(double length, double width){
        this.length=length;
        this.width=width;
    }

    public double getLength(){return this.length;}
    public double getWidth(){return this.width;}

    public abstract void setLength(double newLength);
    public abstract void setWidth(double newWidth);
}
