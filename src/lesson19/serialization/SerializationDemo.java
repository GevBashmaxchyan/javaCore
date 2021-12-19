package lesson19.serialization;

import java.io.*;

public class SerializationDemo {
    private static  final String FILE_PATH ="C:\\Users\\User\\IdeaProjects\\javaCore\\src\\lesson19\\serialization\\file\\example2.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Student student = new Student("poxos","poxosyan",11,"poxosyan@mail.ru");
//
//        ObjectOutputStream objectOutputStream =
//                new ObjectOutputStream(new FileOutputStream(FILE_PATH));
//
//        objectOutputStream.writeObject(student);
//        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));
        Object object = objectInputStream.readObject();
        Student student = (Student) object;
        System.out.println(student);

    }

}
