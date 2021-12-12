package homework;

public class Figure1 {
    public static void main(String[] args) {

        System.out.println("bolor elementnery");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double nums = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            nums += array[i];

        }
        System.out.println("\nyndanur gumary = " + nums);
        System.out.println("mijin tvabanakan=" + nums / array.length);

        System.out.println();
        System.out.println("\nzuygeri qanaky");
        int zuyg = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
                zuyg++;
            }


        }
        System.out.println("yndanur qanaky" + zuyg);


        System.out.println();
        System.out.println("\nkenteri qanaky");
        int kent = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
                kent++;
            }


        }
        System.out.println("yndanur qanaky" + kent);


        System.out.println();

        System.out.println("amenamec tiv");
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }

        }
        System.out.println(max);

        System.out.println();
        System.out.println("amenapoqr tiv");
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println(min);


    }

}





