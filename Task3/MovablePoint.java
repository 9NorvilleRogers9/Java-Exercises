package Task3;

public class MovablePoint extends Point {

    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y,float xSpeed, float ySpeed)
    {
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public  void setSpeed(float xSpeed,float ySpeed)
    {
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float[] getSpeed()
    {
        float arr[]=new float[]{xSpeed,ySpeed};
        return arr;
    }

    @Override
    public String toString() {
        return "("+x+","+y+"," + "speed=("+xSpeed+","+ySpeed+")";
    }

    public MovablePoint move()
    {
        this.x+=this.xSpeed;
        this.y+=this.ySpeed;
        return this;
    }
}
