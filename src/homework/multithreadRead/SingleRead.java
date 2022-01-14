package homework.multithreadRead;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class SingleRead {
    public static String path = "C:\\Users\\User\\Desktop\\sample\\sample.txt";
    public static AtomicInteger countOfKEyword = new AtomicInteger();

    public static void main(String[] args) throws IOException {
        long count = Files.lines(Paths.get(path)).count();
        String keyword = ";";
        System.out.println("all lines: " + count);
        long currentTime = System.currentTimeMillis();

        List<String> strings = Files.readAllLines(Paths.get(path));

        for (String string : strings) {
            if (string.contains(keyword)){
                countOfKEyword.incrementAndGet();
            }
        }

        System.out.println("found lines : " + countOfKEyword);
        long finishTime = System.currentTimeMillis();
        System.out.println("time: " + (finishTime-currentTime));

    }

}
