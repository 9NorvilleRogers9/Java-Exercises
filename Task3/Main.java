package Task3;

public class Main {

    public static void main(String[] args) {

            Point point = new Point(5.0f,3.0f);
            System.out.println(point.toString());
            MovablePoint movablePoint = new MovablePoint(2.0f,3.0f);
            float arr[]= new float[3];
            arr=movablePoint.getSpeed();
            for(double o:arr)
            {
                System.out.println(o);
            }
            System.out.println(movablePoint.toString());
            movablePoint.move();
            System.out.println(movablePoint.toString());
    }

}
