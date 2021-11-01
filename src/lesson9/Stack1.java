package lesson9;

public class Stack1 {
    int stck[] = new int[10];
    int tos;

    Stack1() {
        tos = -1;
    }

    void push1(int item) {
        if (tos == 9) {
            System.out.println("Cтeк заполнен.");
        } else {
            stck[++tos] = item;
        }
    }

    int pop1() {
        if (tos < 0) {
            System.out.println("Cтeк не загружен.");
            return 0;
        } else
            return stck[tos--];
    }

}
