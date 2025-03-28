public class Triangle extends Shape{

    private int side1,side2,side3;


    public static int counter = 0;
    public int counterForObject = 0;

    public Triangle(Point topLeft, int side1, int side2,int side3) {
        super(topLeft);
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
        counter++;
        counterForObject++;
    }

    @Override
    public double area() {
        return this.side1*this.side2/2;
    }

    @Override
    public double perimeter() {
        return this.side1+this.side2+this.side3;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
