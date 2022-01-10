package lesson20;

public class Coords <T extends TwoD>{
    T[] coords;
    Coords(T[] o ){
        coords = o;
    }
    static void showXY(Coords<?>c) {

        System.out.println("значения X Y: ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        }
        System.out.println();

    }
}
