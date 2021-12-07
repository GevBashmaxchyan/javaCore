package lesson16;

public interface Callback {

    int EXIT = 0;

    void callback(int param);

    default void method(){
        System.out.println("kuku");

    }

}
