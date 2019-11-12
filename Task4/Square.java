package Task5;

public class Square extends Rectangle {
    public Square() {

    }

    public Square(double side) {

        super(side,side);
    }

    public Square( double side, String color,boolean filled) {

        super(side,side,color,filled);
    }

    public double getSide() {

        return this.getLenght();
    }
    public void setSide(double side) {
        this.setLenght(side);
        this.setLenght(side);
    }

    @Override
    public void setWidht(double widht) {
        super.setWidht(widht);
    }

    @Override
    public void setLenght(double lenght) {
        super.setLenght(lenght);
    }

    @Override
    public String toString() {

        return "color:" + color + ","+"side:" + getSide();
    }
}
