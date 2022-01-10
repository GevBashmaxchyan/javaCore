package lesson23;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Teкyщий поток исполнения" + t);

        t.setName("myThread");
        System.out.println("Пocлe изменения имени потока" + t);

        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println(i);
                Thread.sleep(1000,222);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток исполнения прерван");
        }

    }
}
