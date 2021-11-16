package homework.author;

import homework.arrayUtilTest.ArrayUtil;

public class AuthorStorage {
//    Author author=new Author();
    Author[] array= new Author[10];
    int size = 0;

    void add(Author author) {
        if (array.length==size) {
            extend();
        }
        array[size++] = author;
    }

    private void extend() {
        Author[] array2 = new Author[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }

    Author getByIndex(int index) {
        if (index < 0 || index > size) {
            System.err.println("Invalid index");
            return null;
        }
        return array[index];
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
