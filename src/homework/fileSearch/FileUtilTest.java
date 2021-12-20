package homework.fileSearch;

import java.io.IOException;

public class FileUtilTest {
    static FileUtil fu = new FileUtil();

    public static void main(String[] args) throws IOException {

        fu.createFileWithContent("C:\\Users\\User\\Desktop\\example","\\jan.txt","cc");
        fu.printSizeOfPackage("C:\\Users\\User\\Desktop\\example");
        fu.FindLines("C:\\Users\\User\\IdeaProjects\\javaCore\\src\\homework\\fileSearch\\file\\text.txt", "gg");

    }
}
