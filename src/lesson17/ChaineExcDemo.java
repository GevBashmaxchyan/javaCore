package lesson17;

public class ChaineExcDemo {
    static void demoproc() {
        NullPointerException e = new NullPointerException("вepxний уровень");
        e.initCause(new ArithmeticException("причина"));
        throw  e ;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException e ){
            System.out.println("Пepexвaчeнo исключение:" + e);
            System.out.println("Пepвопричина: " + e.getCause());
        }
    }

}

