package Task2;

public class Main {

    public static void main(String[] args) {
	Point2D point2D = new Point2D(5.0f,3.0f);
	System.out.println(point2D.toString());
	Point3D point3D = new Point3D(5.0f,5.0f,5.0f);
	float arr[]= new float[3];
	arr=point3D.getXYZ();
	for(double o:arr)
	{
		System.out.println(o);
	}
	System.out.println(point3D.toString());
    }
}
