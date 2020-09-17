package exercises.shapes;

public class Square implements Measurable {

    private double length;

    public Square (double length){
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}
