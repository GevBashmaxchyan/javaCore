package lesson2;

/*
erkar coment.
 */

//karch coment.

public class Example {
    public static void main(String[] args) {
        Integer y = 567;
        Integer x = y;
        // проверяем, что x и y указывают на один объект
        System.out.println(y == x);

        y++;
        System.out.println(x + " " + y);
        // проверяем, что x и y указывают на один объект
        System.out.println(y == x);
    }

}


