package lesson13;

public class StaticDemoTtest {
    public static void main(String[] args) {
        int[]array ={1,2,3};
        StaticDemo.printArray(array);
        System.out.println(StaticDemo.a);
        StaticDemo.a=12;
        System.out.println(StaticDemo.a);
    }

}
