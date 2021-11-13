package homework.newHomework;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

    void add(int value) {
        if (array.length==size) {
            extend();
        }
        array[size++] = value;

    }

    private void extend() {
        int[] array2 = new int[array.length + 10];
        int c = 0;
        for (int i = 0; i < array.length; i++) {
            array2[c++] = array[i];
        }
        array = array2;
    }

    int getByIndex(int index){
       if (index<0||index>size){
           System.err.println("invalide Index");
       }
       return array[index];

    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }


}
