package homework.newHomework;

import javax.crypto.spec.PSource;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("bolor elementnery ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("amenamec tivy ");
        int max = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }


        }
        System.out.println(max);

        System.out.println();
        System.out.println("amenapoqr tivy");
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(min);
        System.out.println();
        System.out.println("bolor zuyg elementnery");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                System.out.print(array[i] + " ");

        }
        System.out.println();
        System.out.println("bolor kent elementnery");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                System.out.print(array[i] + " ");

        }
        System.out.println();
        System.out.println("zuyg elementneri qanaky ");
        int caunt = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                caunt++;
        }
        System.out.println(caunt);
        System.out.println();
        System.out.println("kent elementneri qanaky");
        int caunt2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                caunt2++;
        }
        System.out.println(caunt2);
        System.out.println();
        System.out.println("bolor elementneri gumary ");
        int c = 0;
        for (int i = 0; i < array.length; i++) {
            c=c+ array[i];


        }
        System.out.println(c);
        System.out.println();
        System.out.println("mijin tvabanakan ");
        double a = 0;
        for (int i = 0; i < array.length ; i++) {
            a=a+array[i];


        }
        System.out.println(a/array.length);
    }

}
