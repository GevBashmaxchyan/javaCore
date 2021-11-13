package homework.newHomework;

public class FigurePainter {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++)
                System.out.print("* ");
            System.out.println();


        }
        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print(" *");

            }
            System.out.println();
        }

        System.out.println();
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++)
                System.out.print("* ");
            System.out.println();


        }
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" *");

            }
            System.out.println();

        }
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" *");
            }
            System.out.println();

        }
        for (int i = 3; i > 0; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

}
