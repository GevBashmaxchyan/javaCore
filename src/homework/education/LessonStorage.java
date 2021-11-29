package homework.education;

public class LessonStorage {
    private Lesson[] lessons = new Lesson[10];
    private int size;


    public void add(Lesson lesson) {
        if (lessons.length == size) {
            extend();
        }
        lessons[size++] = lesson;
    }

    private void extend() {
        Lesson[] array = new Lesson[lessons.length + 10];
        System.arraycopy(lessons, 0, array, 0, array.length);
        lessons = array;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i]);
        }
    }


    public Lesson getByLessonName(String lessonname) {

        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equals(lessonname)) {
                return lessons[i];
            }
        }
        return null;
    }


    public void deleteLesson(String lessonname) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equals(lessonname)) {
                ArrayUtil.deleteByIndex(lessons, i, size);
                size--;
            }
        }
    }

    public void searchName(String name) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equals(name)) {
                System.out.println(lessons[i]);
            }
        }

    }
}
