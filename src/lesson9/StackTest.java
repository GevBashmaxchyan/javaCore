package lesson9;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(34);
        stack.push(44);
        stack.push(54);



        stack.pop();
        System.out.println(stack.pop());
        stack.push(64);
        System.out.println(stack.pop());


    }
}
