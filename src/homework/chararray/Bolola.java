package homework.chararray;

public class Bolola {
    public static void main(String[] args) {
        char[] bolola = {'b', 'a', 'b', 'o', 'l', 'a'};
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == 'b' && bolola[i + 2] == 'b') {
                System.out.println(true);
                 if (bolola[i] == 'b' && bolola[i + 2] != 'b'){
                     System.out.println(false);
                 }


            }

        }
    }


}

