package lesson13;

public class TestStack2 {
    public static void main(String[] args) {
        Stack mysteck1= new Stack(5);
        Stack mysteck2= new Stack(8);

        for (int i = 0; i < 5; i++) {
           mysteck1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            mysteck2.push(i);
        }
        System.out.println("Cтeк в mystack1");
        for (int i = 0; i < 5; i++) {
            System.out.println(mysteck1.pop());
        }
        System.out.println("Cтeк в mystack2 ");
        for (int i = 0; i < 8; i++) {
            System.out.println(mysteck2.pop());
        }
    }
}
