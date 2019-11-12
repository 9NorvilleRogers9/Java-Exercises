package Task8;

public class Main {

    public static void main(String[] args) {
	ResizebleCircle resizebleCircle= new ResizebleCircle(5.0);
	System.out.println("Perimetr:"+resizebleCircle.getPerimetr());
	System.out.println("Area:"+resizebleCircle.getArea());
	resizebleCircle.resize(5);
	System.out.println(" ");
	System.out.println("Perimetr:"+resizebleCircle.getPerimetr());
	System.out.println("Area:"+resizebleCircle.getArea());

    }
}
