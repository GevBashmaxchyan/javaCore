package lesson14;

public class B extends A {

    int y;
    int i;


    void printY(){
        System.out.println(y);
    }

    B(int a, int b){
        super.i=a;
        i=b;

    }
    void show(){
        System.out.println("Члeн i в суперклассе: "+ super.i);
        System.out.println("Члeн i в  подклассе: "+ i);
    }

}
