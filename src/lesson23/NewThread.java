package lesson23;

public class NewThread implements Runnable {
    String name;
    Thread t;
    boolean susplendFlag;

    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Hoвый поток: " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name +": " + i);
                Thread.sleep(200);
                synchronized (this){
                    while (susplendFlag){
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + "прерван.");
        }
        System.out.println(name + " завершен.");
    }
    synchronized void mysuspend(){
        susplendFlag = true;
    }
    synchronized void myresume(){
        susplendFlag = false;
        notify();
    }
}
