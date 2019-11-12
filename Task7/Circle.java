package Task8;

import java.util.regex.Matcher;

public class Circle implements GeometricObject {
    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimetr() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }
}
