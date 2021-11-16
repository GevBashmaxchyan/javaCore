package lesson13;

public class VarArgs3 {
    static void vaTest(int... v) {
        System.out.println("vaTest(int ...)" + "Количество аргументов: " +
                v.length + " Содержимое: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();

    }
    static void vaTest(boolean... v) {
        System.out.println("vaTest(boolean ...v)" + "Количество аргументов: " +
                v.length + " Содержимое: ");
        for (boolean x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(String msg, int... v) {
        System.out.println("vaTest(String msg,int ...v)" + msg +
                v.length + " Содержимое: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest("proverka: ",10,20);
        vaTest(true,false,false);
    }
}

