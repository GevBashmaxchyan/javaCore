package HomeWork;

public class Fiure1 {
    public static void main(String[] args) {

        System.out.println("\n3 orinak\n");
        for (int i = 0; i < 4; i++) {
            for (int j = i+1; j > i; j++) {
                System.out.println("  ");

            }

        }
        for (int k = 0; k <= 4; k++) {
            System.out.print(" *");

        }
        System.out.println();
    }
}