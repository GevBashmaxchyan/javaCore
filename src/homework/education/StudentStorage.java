package homework.education;

public class StudentStorage {
    private Student[] students = new Student[10];
    private int size;

    public void add(Student student) {
        if (students.length == size) {
            extend();
        }
        students[size++] = student;
    }

    private void extend() {
        Student[] array = new Student[students.length + 10];
        System.arraycopy(students,0,array,0,array.length);
    }
    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }

    public Student getByEmail(String email) {

        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email)){
                return students[i];
            }
        }
        return null;
    }


    public void deleteStudent(String email) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email)){
                ArrayUtil.deleteByIndex(students,i,size);
                size--;
            }
        }
    }
}
