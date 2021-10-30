package homework.chararray;

public class Orinakbolola {
    public static void main(String[] args) {
        char[] bolola = {'b', 'o', 'b', 'o', 'l', 'a'};
        boolean isbob = false;
        for (int i = 0; i < bolola.length - 2; i++) {
            if (bolola[i] == 'b' && bolola[i + 2] == 'b') {
                isbob = true;

            }

        }
        System.out.println(isbob);
//        if (bolola[bolola.length - 2] == 'l' && bolola[bolola.length - 1] == 'y') {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
//        char c = 'o';
//        int caunt = 0;
//        for (int i = 0; i < bolola.length; i++) {
//            if (bolola[i] == c) {
//                caunt++;
//            }
//
//        }
//        System.out.println("caunt of '" + c + "' = " + caunt);


    }
}
