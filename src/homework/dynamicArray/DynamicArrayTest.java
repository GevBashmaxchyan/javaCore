package homework.dynamicArray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();

        for (int i = 0; i < 10; i++) {
            da.add(i + 1);
        }

        int[] numbers = {33, 44, 55};


        da.add(numbers);
        da.print();
        da.add(66, 2);
        da.print();
        da.set(22,4);
        da.print();
        System.out.println(da.isEmpty());
        System.out.println(da.isExists(66));


        da.delete(4);
        da.print();


//        System.out.println(da.getByIndex(0));


//        da.add(1);
//        da.add(2);
//        da.add(3);
//        da.add(4);
//        da.add(5);
//        da.add(6);
//        da.add(7);
//        da.add(8);
//        da.add(9);
//        da.add(10);
//        da.add(11);
//        da.add(12);
//        da.add(12);
//        da.add(12);
//        da.add(12);
//        da.add(15);
//        da.add(15);
//        da.add(15);
//        da.add(15);
//        da.add(15);
//        da.add(15);
//        da.add(15);
//        da.add(15);
//        da.add(1);
//
//
//
//        System.out.println("indexerordi elementy = " + da.getByIndex(4));
//        da.print();


    }
}
