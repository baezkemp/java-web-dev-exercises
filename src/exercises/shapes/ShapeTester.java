package exercises.shapes;

import java.util.ArrayList;

public class ShapeTester {

    public static double totalArea(ArrayList<Measurable> shapes){
        double sum = 0;
        for(int i = 0; i < shapes.size(); i++){
            Measurable oneShape = shapes.get(i);
            sum += oneShape.getArea();
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Measurable> shapes = new ArrayList<>();
        Square s = new Square(5);
        Circle c = new Circle(7);
        shapes.add(s);
        shapes.add(c);

        System.out.println(totalArea(shapes));
    }
}
