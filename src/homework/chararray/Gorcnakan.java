package homework.chararray;

public class Gorcnakan {
    public static void main(String[] args) {

        char[] text = {' ', ' ', 'H', 'e', 'l', 'l', 'o', ' ', 'J', 'a', 'v', 'a', ' ', ' ', ' '};
        int startIndex = 0;
        int endIndex = text.length - 1;

        while (startIndex < endIndex && text[startIndex] == ' ') {
            startIndex++;
        }
        while (startIndex < endIndex && text[endIndex] == ' ') {
            endIndex--;
        }


        char[] result = new char[(endIndex - startIndex) + 1];

        int index = 0;

        for (int i = startIndex; i <= endIndex; i++) {
            result[index++] = text[i];

        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

        }


//        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
//        boolean isBob = false;
//
//        for (int i = 0; i < bolola.length -2; i++) {
//            if (bolola[i] == 'b' && bolola[i + 2] == 'b'){
//                isBob = true;
//                break;
//            }
//
//        }
//        System.out.println(isBob);
//        char c = 'o';
//        int caunt = 0;
//        for (int i = 0; i < bolola.length; i++) {
//            if (bolola[i] == c) {
//                caunt++;
//
//            }
//
//        }
//        System.out.println("caunt of " + c + " = " + caunt);
//        System.out.println();
//
//        System.out.println(bolola[bolola.length / 2]);
//        System.out.println(bolola[bolola.length / 2 + 1]);
//
//        System.out.println();


//        if (bolola[bolola.length - 2] = 'l' &&
//                bolola[bolola.length - 1] = 'y') {
//            System.out.println(true);
//
//        } else {
//            System.out.println(false);
//
//
//        }
    }
}
