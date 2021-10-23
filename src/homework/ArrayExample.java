package homework;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {2, 44, 78, 65, 92, 12, 34, 55, 71, 14};
        int tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.println(array[i]);

            }

        }


//        int n = 34;
//        int a = -1;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == n) {
//                a = i;
//                break;
//
//
//
//            }
//
//
//
//        }
//        System.out.println(a);
//
//    }
    }
}
