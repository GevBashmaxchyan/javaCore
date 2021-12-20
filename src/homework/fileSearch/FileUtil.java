package homework.fileSearch;

import java.io.*;

public class FileUtil {


    public void FindLines(String txtPath, String keyword) throws IOException {

        try (BufferedReader inputStream = new BufferedReader(new FileReader(txtPath))) {
            String line = "";
            while ((line = inputStream.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println(line);
                }
            }


        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printSizeOfPackage(String path) {

        File file = new File(path);
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File singleFile : files) {
                System.out.println(singleFile.getName() + " " + singleFile.length());
            }
        } else {
            System.out.println("file is nor directory");
        }

    }

    public void createFileWithContent(String path, String filename, String content) throws IOException {

        File file = new File(path + filename);

        if (!file.isFile()) {
            file.createNewFile();
        } else {
            System.out.println("isFile");
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(content);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
