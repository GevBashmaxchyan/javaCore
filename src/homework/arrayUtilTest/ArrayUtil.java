package homework.arrayUtilTest;

public class ArrayUtil {

    int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }


        }

        return max;
    }

    int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }


        return min;
    }


    void print(int[] array) {
        for (int i : array) {

            System.out.print(i + " ");

        }

        System.out.println();


    }

    void zuyg(int[] array) {
        System.out.print("zuyg tvern en = ");

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {

                System.out.print(array[i] + " ");
            }


        }
        System.out.println();


    }


    void kent(int[] array) {
        System.out.print("kent tvern en = ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {

                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    double mijin(int[] array) {
        double result = 0;
        int i;


        for (i = 0; i < array.length; i++) {
            result += array[i];


        }
        System.out.println("michin tvabanakan arjeqy = " + result / 10);
        return result;
    }

    int cauntkent(int[] array) {
        int caunt2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                caunt2++;
            }

        }
        System.out.print("kent tveri qanaky = ");
        return caunt2;

    }

    int cauntzuyg(int[] array) {
        int caunt = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                caunt++;

            }


        }
        System.out.print("zuyg tveri qanaky = ");
        return caunt;
    }

    int arjeq(int[] array) {
        int result2 = 0;

        for (int i = 0; i < array.length; i++) {
            result2 = result2 + array[i];

        }
        System.out.print("bolor tveri gumary = ");
        return result2;
    }


}
