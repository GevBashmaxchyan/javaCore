package lesson16.p1;

public class Protection {
    int n = 1;
    private int pri = 2;
    protected int pro = 3;
    public int pub = 4;

    public Protection(){
        System.out.println("кoнcтpyктop базового класса");
        System.out.println("n = " + n);
        System.out.println("pri = " + pri);
        System.out.println("pro = " + pro);
        System.out.println("pub = " + pub);
    }
}
