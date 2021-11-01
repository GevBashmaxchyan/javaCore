package lesson8;

public class BoxTest {

    public static void main(String[] args) {
        Box myBox = new Box(10, 20, 30);
        System.out.println(myBox.volume());

        Box myBox1 = new Box(3, 6, 9);
        System.out.println(myBox1.volume());

    }

}
