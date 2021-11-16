package lesson13;

public class Outer2 {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        int y = 10;

        void display() {
            System.out.println("вывoд: outer_x = " + outer_x);
        }
    }
//    void showy(){
//        System.out.println(y);
    // y hasaneli e miyayn nerdrvac klasi sahmannerum
    // }
}
