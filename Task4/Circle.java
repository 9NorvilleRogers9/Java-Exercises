package Task5;

public class Circle extends Shape{
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {

        super(color,filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI*Math.pow(this.radius,2);
    }

    public double getPerimetr()
    {
        return 2*Math.PI*this.radius;
    }

    @Override
    public String toString() {
        return "radius" + radius;
    }
}
