package lesson2;

public class A {
    static void meth(){
        System.out.println(10);
    }

    public static  void main(String[] args) {
        int n = 33;
        int s = 0;
        while (n > 0) {
            s += n % 2;
            n /= 2;
        }
        System.out.println(s);
    }
}
