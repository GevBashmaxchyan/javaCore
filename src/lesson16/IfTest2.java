package lesson16;

import lesson16.DynStack;

public class IfTest2 {
    public static void main(String[] args) {
        DynStack mystack1 = new DynStack(5);
        DynStack mystack2 = new DynStack(8);
//В этих циклах увеличиваются размеры каждого стека
        for (int i = 0; i < 12; i++) mystack1.push(i);
        for (int i = 0; i < 20; i++) mystack2.push(i);
        System.out.println("Cтeк в mystackl:");
        for (int i = 0; i < 12; i++)
            System.out.println(mystack1.pop());
        System.out.println("Cтeк в mystack2:");
        for (int i = 0; i < 20; i++)
            System.out.println(mystack2.pop());
    }
}
