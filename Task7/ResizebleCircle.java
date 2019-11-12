package Task8;

public class ResizebleCircle extends Circle implements Resizable {

    public ResizebleCircle( double radius)
    {
        super(radius);
    }

    @Override
    public void  resize(int percent) {
        this.radius*=percent;
    }
}
