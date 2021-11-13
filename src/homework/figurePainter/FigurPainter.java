package homework.figurePainter;

public class FigurPainter {

    void figurOne(int n, char c) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++)

                System.out.print(c + " ");
            System.out.println();
        }
    }

    void figureOne(int n) {
        figurOne(n, '*');
    }

    void figureTwo(int n, char c) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= 4 - i; j++) {
                System.out.print("  ");
            }

            for (int k = 0; k < i + 1; k++) {
                System.out.print(c + " ");
            }

            System.out.println();
        }
    }

    void figureThree(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print(c + " ");

            }
            System.out.println();

        }
    }

    void figureFour(int n, char c) {
        for (int i = n; i > 0; i--) {
            for (int j = 4; j > i; j--) {
                System.out.print("   ");

            }
            for (int j = 0; j < i; j++) {
                System.out.print(c + "  ");

            }
            System.out.println();

        }
    }

    void figureFive(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 4 - i; j++) {
                System.out.print("  ");

            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print(" " + c + "  ");

            }
            System.out.println();

        }

        for (int i = n; i > 0; i--) {
            for (int j = 0; j <= 5 - i; j++) {
                System.out.print("  ");

            }
            for (int k = 0; k < i; k++) {
                System.out.print(" " + c + "  ");

            }
            System.out.println();


        }


    }


}
