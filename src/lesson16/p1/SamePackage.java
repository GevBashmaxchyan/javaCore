package lesson16.p1;

public class SamePackage {
    SamePackage(){
        Protection p = new Protection();
        System.out.println("n = " + p.n);
//        System.out.println("pri = " + p.pri);
        System.out.println("pro = " + p.pro);
        System.out.println("pub = " + p.pub);
    }
}
