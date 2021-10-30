package homework.arrayutil;

public class ArrayExample {
    public static void main(String[] args) {

        int[] array = {3, 6, 4, 6, 23, 56, 32, 23, 78, 11};
        boolean x = true;
        for (int i = 0; i < array.length; i++) {


            if (array[i] % 2 != 0) {
                x =false;

                break;
            }



        }
        System.out.println(x);


//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//
//
//                if (array[i] == array[j]) {
//
//
//                    System.out.println(array[i] + "-krknvum e");
//                    break;
//                }
//
//            }
//
//
//        }

    }
}
