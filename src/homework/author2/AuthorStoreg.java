package homework.author2;

public class AuthorStoreg {
    private Author[] array = new Author[10];
    private int size;

    public void add(Author author) {
        if (array.length == size) {
            extend();
        }
        array[size++] = author;
    }

    private void extend() {
        Author[] array2 = new Author[array.length + 10];
        System.arraycopy(array, 0, array2, 0, array.length);
        array = array2;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public void searchByname(String keyword) {
        for (int i = 0; i < size; i++) {
            if (array[i].getName().contains(keyword) ||
                    array[i].getSurname().contains(keyword)) {

                System.out.println(array[i]);
            }
        }
    }

    public void searchByAge(int minAge, int maxAge) {
        for (int i = 0; i < size; i++) {
            if (array[i].getAge() > minAge &&
                    array[i].getAge() < maxAge) {
                System.out.println(array[i]);
            }
        }
    }
}
