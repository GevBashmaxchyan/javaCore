package lesson15;

abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    abstract double area();
//    {
//        System.out.println("Плoщaдь фигуры не определена. ");
//        return 0;
//    }
}
