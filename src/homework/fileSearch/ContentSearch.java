package homework.fileSearch;

import java.io.File;
import java.util.Scanner;

public class ContentSearch {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("please input path");
        String path = scanner.nextLine();
        File file = new File(path);
        if (file.isDirectory()) {
            System.out.println("please input keyword");
            String keyword = scanner.nextLine();
            File[] files = file.listFiles();
            for (File singleFile : files) {
                if (singleFile.getName().contains(keyword)) {
                    System.out.println(singleFile.getName());
                }
            }


        }

    }
}
