package Lesson4;

public class TwoDArray {
    public static void main(String[] args) {
        int twoD[] [] = new int [7] [8];
        int i, j, k =0;
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 8; j++) {
                twoD [i] [j]=k;
                k++;


            }

        }
        for (i = 0; i <7 ; i++) {
            for (j = 0; j < 8; j++) {
                System.out.print(twoD[i] [j]+ " ");


            }
            System.out.println();
        }
    }
}
