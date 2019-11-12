package Task5;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(10.0);
        System.out.println("Circle area:"+circle.getArea());
        System.out.println("Circle perimetr:"+circle.getPerimetr());

        System.out.println(" ");

        Rectangle rectangle = new Rectangle(5.0,7.0);
        System.out.println("Rectangle area:"+rectangle.getArea());
        System.out.println("Rectangle perimetr:"+ rectangle.getPerimetr());

        System.out.println(" ");

        Square square = new Square(5.0,"red",true);
        System.out.println("Square area:"+square.getArea());
        System.out.println("Square perimetr:"+ square.getPerimetr());
        System.out.println(square.toString());

    }
}
