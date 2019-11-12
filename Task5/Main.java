package Task6;

public class Main {

    public static void main(String[] args) {

        MovableCircle movableCircle=new MovableCircle(3,3,2,2,5);
        System.out.println(movableCircle.toString());
        System.out.println(" ");
        movableCircle.moveUp();
        System.out.println(movableCircle.toString());
    }
}
