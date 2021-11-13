package homework.dynamicArray;

public class DynamicArray2 {

    private int[] array = new int[10];
    private int size = 0;

    void add(int index) {
        if (size == array.length) {
            extend();
        }
        array[size++] = index;
    }

    private void extend() {
        int[] array2 = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }

    int getByIndex(int index) {
        if (index < 0 || index > size) {
            System.err.println("Invalid index");
            return -1;
        }
        return array[index];
    }

    int print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");
        }

        return array[size];
    }

}
