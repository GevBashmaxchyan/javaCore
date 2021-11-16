package lesson13;

public class Stack {
    private int stack[];
    private int tos;

    Stack(int size) {
        stack = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stack.length - 1)
            System.out.println("Cтeк заполнен.");
        else
            stack[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Cтeк не загружен.");
            return 0;
        }
        else
            return stack[tos--];
    }
}
