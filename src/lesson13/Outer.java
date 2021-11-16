package lesson13;

public class Outer {

    static int a = 4;

    void test(){
        System.out.println("Outer.test");
    }
    static class Inner{
        int b = 44;
        void showA(){
            System.out.println(a);
        }
    }
}
