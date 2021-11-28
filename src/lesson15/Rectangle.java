package lesson15;

public class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("B области четырехугольника. ");
        return dim1 * dim2;
    }
}
