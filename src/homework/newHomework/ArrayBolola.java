package homework.newHomework;

public class ArrayBolola {
    public static void main(String[] args) {
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'o';
        int a = 0;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c)
                a++;
        }
        System.out.println(a);


        System.out.println("tpel mejtexi 2 sinvoly");
        System.out.println(bolola[bolola.length / 2 + 1]);
        System.out.println(bolola[bolola.length / 2]);

        System.out.println("ete verjum ly tru ete voch false");

        if (bolola[bolola.length - 2] == 'l' && bolola[bolola.length - 1] == 'y') {
            System.out.println(true);
        } else
            System.out.println(false);

        System.out.println("tpel tru ete bob bary ka");
        char[] bolola1 = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean isbob=false;
        for (int i = 0; i < bolola1.length-2; i++) {
            if (bolola1[i] == 'b' && bolola1[i+2]  == 'b'){
                isbob=true;
            }


        }System.out.println(isbob);

        char[] text = {' ',' ','b','a','r','e','v',' ',' '};
        int startIndex=0;
        int endIndex= text.length-1;
        while (startIndex<endIndex&& text[startIndex]==' '){
            startIndex++;
        }
        while (startIndex<endIndex&& text[endIndex]==' '){
            endIndex--;
        }
        char[]result=new char[(endIndex-startIndex)+1];
        int g = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            result[g++]=text[i];

        }
        for (int i = 0; i < text.length; i++) {

        }
        System.out.println(result);


    }

}
