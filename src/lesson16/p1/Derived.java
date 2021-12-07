package lesson16.p1;

public class Derived extends Protection{
    Derived(){
        System.out.println("кoнcтpyктop подкласса");
        System.out.println("n = " + n);
//        System.out.println("pri = " + pri);
        System.out.println("pro = " + pro);
        System.out.println("pub = " + pub);
    }
}
