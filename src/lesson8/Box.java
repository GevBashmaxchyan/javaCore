package lesson8;

public class Box {

    double width;
    double height;
    double depth;

    double volume() {

        double vol = width * height * depth;
        return vol;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

}
