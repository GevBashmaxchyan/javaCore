package homework.author2;

public class BookStorage {
    private Book[] array = new Book[10];
    private int size;

    public void add(Book books) {
        if (array.length == size) {
            extend();
        }
        array[size++] = books;
    }

    private void extend() {
        Book[] array2 = new Book[array.length + 10];
        System.arraycopy(array, 0, array2, 0, array.length);
        array = array2;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public void searchByBookTitle(String keyword) {
        for (int i = 0; i < size; i++) {
            if (array[i].getTitle().contains(keyword) ) {

                System.out.println(array[i]);
            }
        }
    }
}
