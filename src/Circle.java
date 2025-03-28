public class Circle extends Shape{


    private int radius;

    public Circle(Point center, int radius) {
        super(center);
        this.radius = radius;
    }



    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "location=" + getLocation() +
                ", radius=" + radius +
                '}';
    }
}
