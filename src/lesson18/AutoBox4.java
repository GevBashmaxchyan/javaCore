package lesson18;

public class AutoBox4 {
    public static void main(String[] args) {
        Integer iOb = 100;
        Double dOb = 98.6;

        dOb = dOb + iOb;
        System.out.println("dOb после выражения: " + dOb);

        Integer i = 2;

        switch (i){
            case 1:
                System.out.println("один");
                break;
            case 2 :
                System.out.println("два");
                break;
            default:
                System.out.println("ошибка");
        }
    }
}
