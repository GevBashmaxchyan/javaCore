package homework.chararray;

public class CharArray {
    public static void main(String[] args) {

        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'o';
        int a = 0;
        for (char i = 0; i < bolola.length; i++) {
            if (bolola[i] == c) {
                c = bolola[i];
                a++;

            }


        }
        System.out.println("1)c popoxakani qanaky =: " + a);

        System.out.println();


        System.out.println("2) tpel mejtexi 2 sinvoly");
        System.out.print(bolola[bolola.length / 2 + 1]);
        System.out.println(bolola[bolola.length / 2]);


        System.out.println("3)tpel ete verjanum e ly=true ete la= false");

        if (bolola[bolola.length - 2] == 'l' & bolola[bolola.length - 1] == 'y') {
            System.out.println(true);

        }
        if (bolola[bolola.length - 2] == 'l' & bolola[bolola.length - 1] == 'a') {
            System.out.println(false);
        }


        System.out.println();


    }


}



