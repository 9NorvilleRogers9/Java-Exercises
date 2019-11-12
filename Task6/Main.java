package Task7;

public class Main {

    public static void main(String[] args) {

        MovableRectangle movableRectangle = new MovableRectangle(0,0,5,5,2,2);
        System.out.println(movableRectangle.toString());
        movableRectangle.moveDown();
        movableRectangle.moveRight();
        System.out.println(movableRectangle.toString());
    }
}
