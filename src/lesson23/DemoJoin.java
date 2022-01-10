package lesson23;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread3 ob1 = new NewThread3("Один");
        NewThread3 ob2 = new NewThread3("Два");
        NewThread3 ob3 = new NewThread3("Три");

        System.out.println("Пoтoк Один запущен:" + ob1.t.isAlive());
        System.out.println("Пoтoк Два запущен:" + ob2.t.isAlive());
        System.out.println("Пoтoк Три запущен:" + ob3.t.isAlive());

        try {
            System.out.println("Oжидaниe завершения потоков.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Глaвный поток прерван");
        }
        System.out.println("Пoтoк Один запущен:" + ob1.t.isAlive());
        System.out.println("Пoтoк Два запущен:" + ob2.t.isAlive());
        System.out.println("Пoтoк Три запущен:" + ob3.t.isAlive());
        System.out.println("Глaвный поток завершен.");

    }
}
