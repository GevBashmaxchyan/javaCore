package homework;

public class Barev {
    public static void main(String[] args) {
        char[] array = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        int startindex = 0;
        int endindex = array.length - 1;
        while (startindex < endindex && array[startindex] == ' ') {
            startindex++;

        }
        while (startindex < endindex && array[endindex] == ' ') {
            endindex--;
        }
        char[] result = new char[(endindex - startindex) + 1];
        int c = 0;
        for (int i = startindex; i <= endindex; i++) {
            result[c++] = array[i];

        }
        for (int i = 0; i < array.length; i++) {


        }
        System.out.println(result);


    }
}
