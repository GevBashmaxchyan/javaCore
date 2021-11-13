package lesson12;

public class OverloadCons2 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        Box myclone = new Box(mybox1);

        double vol;
        vol = mybox1.volume();
        System.out.println("mybox1 cavaly havasar e: " + vol);
        vol = mybox2.volume();
        System.out.println("mybox2 cavaly havasar e: " + vol);
        vol = mycube.volume();
        System.out.println("mycube cavaly havasar e: " + vol);
        vol = myclone.volume();
        System.out.println("myclone cavaly havasar e: " + vol);
    }
}
