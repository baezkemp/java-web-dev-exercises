package exercises.shapes;

public class Circle implements Measurable {

    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter(){
        return 2 * radius;
    }

}
