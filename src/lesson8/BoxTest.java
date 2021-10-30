package lesson8;

public class BoxTest {

    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox1 = new Box();

        myBox.setDim(10, 20, 15);


        double vol = myBox.volume();
        System.out.println(vol);


        myBox1.setDim(3, 6, 9);

        double vol2 = myBox1.volume();
        System.out.println(vol2);


    }

}
