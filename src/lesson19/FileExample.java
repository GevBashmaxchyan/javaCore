package lesson19;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\User\\Desktop\\example\\example4.docx";
        File file = new File(path);
        File newFile = new File("C:\\Users\\User\\Desktop\\example\\example44.docx");
        file.renameTo(newFile);

//        System.out.println(file.isDirectory());
//        System.out.println(file.exists());
//        System.out.println(file.canWrite());
//        long modified = file.lastModified();
//        System.out.println(new Date(modified));

//        if (!file.exists()){
//            file.mkdirs();
//        }
//        if (!file.exists()){
//            if (file.createNewFile()) {
//                System.out.println("file is created!");
//            }
//        }
//        if (file.exists()){
//            file.delete();
//        }
//        System.out.println(file.exists());


//        File[] files = file.listFiles();
//        for (File singleFile : files) {
//            String name = singleFile.getName();
//            if (!singleFile.isHidden() && name.contains(".")) {
//                String[] split = name.split("\\.");
//                System.out.println(split[split.length - 1]);
//            }
//        }

    }
}
