package lesson19.file;

import java.io.*;

public class FileReadAndWrite {
    private static final String FILE_PATH = "C:\\Users\\User\\IdeaProjects\\javaCore\\src\\lesson19\\file\\example.txt";

    public static void main(String[] args) {
//        write();
        read();
    }

    private static void read() {
        try (BufferedReader inputStream = new BufferedReader(new FileReader(FILE_PATH))) {
//            String line = "";
//            while ((line = inputStream.readLine()) != null) {
//                System.out.println(line);
//            }
            int c ;
            while ((c = inputStream.read()) != -1) {
                System.out.print((char) c );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void write() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            bw.write("Hello From JAVA \r\n");
            bw.write("Hello From JAVA line 2!!!!!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
