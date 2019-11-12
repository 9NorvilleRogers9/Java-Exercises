package Task5;

public class Rectangle extends Shape {
    protected double widht;
    protected double lenght;

    public Rectangle() {
    }


    public Rectangle(double lenght, double widht) {
        this.widht=widht;
        this.lenght = lenght;
    }

    public Rectangle(double width, double lenght, String color, boolean filled) {
        super(color, filled);
        this.lenght=lenght;
        this.widht=width;
    }

    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public  double getArea()
    {
        return this.lenght*this.widht;
    }

    @Override
    public double getPerimetr()
    {
        return 2*(this.widht+this.lenght);
    }

    @Override
    public String toString()
    {

        return "widht" + widht + "," + "lenght" + lenght +","+"color" +color;
    }
}
