package homework.newHomework;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        for (int i = 0; i < 12; i++) {
            da.add(i + 1);
        }
        da.print();
        System.out.println(da.getByIndex(3));


    }
}
