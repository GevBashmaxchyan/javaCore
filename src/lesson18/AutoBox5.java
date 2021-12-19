package lesson18;

public class AutoBox5 {
    public static void main(String[] args) {
        Boolean b = true;
        if (b){
            System.out.println("b = true");
        }
        Character ch = 'x';
        char ch2 = ch;
        System.out.println("che2 == " + ch2);
    }
}
