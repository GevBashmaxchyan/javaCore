package homework.dynamicArray;

public class DynamicArrayTest2 {
    public static void main(String[] args) {
        DynamicArray2 da =new DynamicArray2();
        for (int i = 0; i <15 ; i++) {
            da.add(i);

        }
        System.out.println(da.getByIndex(5));
        da.print();


    }
}
