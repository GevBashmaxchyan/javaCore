package lesson20;

public class GenCons {
    private double val;
    <T extends Number>GenCons(T arg){
        val = arg.doubleValue();
    }
    void showal(){
        System.out.println("val: " + val);
    }
}
