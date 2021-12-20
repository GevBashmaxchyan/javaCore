package homework.fileSearch;

import java.io.File;
import java.util.Scanner;

public class FileSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input path");
        String path = scanner.nextLine();
        File file = new File(path);
        System.out.println("please input file name by search");
        String fileName = scanner.nextLine();
        File file2 = new File(file+fileName);
        System.out.println(file2.isFile());

    }
}
