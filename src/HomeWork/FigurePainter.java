package HomeWork;

public class FigurePainter {
    public static void main(String[] args) {
        System.out.println("1 orinak\n");
        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++)

                System.out.print("* ");
            System.out.println();
        }

        System.out.println("\n 2 orinak\n"); {

            for ( i = 0; i < 4; i++) {

                for (j = 0; j <= 4 - i; j++) {
                    System.out.print("  ");
                }

                for (int k = 0; k < i + 1; k++) {
                    System.out.print("* ");
                }

                System.out.println();
            }



        }


        System.out.println("\n3 orinak\n");
        for ( i = 0; i <4 ; i++) {
            for ( j = i; j <4 ; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }




        }


    }


