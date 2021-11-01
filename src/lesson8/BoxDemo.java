package lesson8;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);

        double vol;
        vol = mybox.volume();
        System.out.println("arjeqy havasar e: " + vol);

        vol = mybox2.volume();
        System.out.println("arjeqy havasar e: "+ vol);
    }

}
