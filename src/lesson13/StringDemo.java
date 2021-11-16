package lesson13;

public class StringDemo {
    public static void main(String[] args) {
        String name = " Poxos Poxosyan   ";

        String trim = name.trim();
        String s = trim.toUpperCase();
        System.out.println(s);
        System.out.println(trim);
        StringBuilder sb = new StringBuilder();
        sb.append(5);
        sb.append("poxos");
        sb.append(' ');
        sb.append("petrosyan");
        String a = sb.toString();
        System.out.println(sb);
    }
}
