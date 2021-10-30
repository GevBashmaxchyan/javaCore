package homework.chararray;

public class Bolola {
    public static void main(String[] args) {
        char[] bolola = {'b', 'a', 'b', 'o', 'b', 'a'};
        boolean isbob = false;
        for (int i = 0; i < bolola.length - 2; i++) {
            if (bolola[i] == 'b' && bolola[i + 2] == 'b') {
                isbob = true;
                break;


            }


        }
        System.out.println(isbob);
    }


}

