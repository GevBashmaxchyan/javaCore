package Lesson3;

public class BoolTest {

    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b havasar e " + false);
        b = true;
        System.out.println("b havasar e " + false);

        if (b) System.out.println("kody ashxatum e.");
        b = false;
        if (b) System.out.println("kody chi ashxatum.");

        System.out.println("10>9 havasar e " + (10 > 9));
    }

}
