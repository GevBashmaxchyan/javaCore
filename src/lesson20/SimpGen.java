package lesson20;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer,String>tgObj = new TwoGen<>(88,"Обобщения");
        tgObj.showTypes();
        int v = tgObj.getOb1();
        System.out.println("значения: " + v);
        String str = tgObj.getOb2();
        System.out.println("значения: " +str);
    }
}
