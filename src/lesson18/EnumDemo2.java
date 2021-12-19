package lesson18;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Константы перечислимого типа Apple");
        Apple allapples[] = Apple.values();
        for (Apple apple : allapples) {
            System.out.println(apple);
        }
        System.out.println();

        ap = Apple.valueOf("WINESAP");
        System.out.println("Пepeмeннaя ар содержит " + ap);


    }
}
