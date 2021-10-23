package lesson3;

public class Conversion {

    public static void main(String[] args) {

        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("\npoxakerpum  int depi byte. ");
        b = (byte) i;
        System.out.println("i ev b " + i + " " + b);
        System.out.println("\n poxakerpum double depi int. ");
        i = (int) d;
        System.out.println("d u i " + d + " " + i);
        System.out.println("\n poxakerpum double depi byte.");
        b = (byte) d;
        System.out.println("d ev b " + d + " " + b);


    }

}
