package lesson12;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i =88;
        ob.test();
        ob.test(10, 20);
        ob.test(i);
        ob.test(123.2);

    }
}
