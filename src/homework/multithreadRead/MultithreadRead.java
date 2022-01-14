package homework.multithreadRead;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MultithreadRead implements Runnable {
        public static String keyword;
        public static List<String> stringList;
        public  static AtomicInteger atomicInteger = new AtomicInteger();
        public static Thread t ;

        MultithreadRead(String keyword,List<String> stringList) {
            t = new Thread(this);
            this.keyword = keyword;
            this.stringList = stringList;
            t.start();

        }

    public static void main(String[] args) throws IOException, InterruptedException {
        String path = "C:\\Users\\User\\Desktop\\sample\\sample.txt";
        int count = (int) Files.lines(Paths.get(path)).count();
        System.out.println("all lines: " + count);


        List<String> stringList = Files.readAllLines(Paths.get(path));

        List<String> subList = stringList.subList(1, count / 4);
        List<String> subList1 = stringList.subList((count / 4) + 1, 2 * (count / 4));
        List<String> subList2 = stringList.subList((2 * (count / 4)) + 1, 3 * (count / 4));
        List<String> subList3 = stringList.subList((3 * (count / 4)) + 1, count);
        long currentTime = System.currentTimeMillis();

        new MultithreadRead(";",subList).t.join();
        new MultithreadRead(";",subList1).t.join();
        new MultithreadRead(";",subList2).t.join();
        new MultithreadRead(";",subList3).t.join();

        System.out.println("found lines : " + atomicInteger);
        long finishTime = System.currentTimeMillis();
        System.out.println("time: " + (finishTime-currentTime));


    }

    @Override
    public void run() {

        for (String string : stringList) {
            if (string.contains(keyword)){
                atomicInteger.incrementAndGet();
            }
        }
    }
}
