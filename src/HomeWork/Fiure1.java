package HomeWork;

import com.sun.corba.se.impl.encoding.CDROutputObject;

public class Fiure1 {
    public static void main(String[] args) {

        System.out.println("zuyg elementneri qanaky");


        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int caunt = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                caunt++;

            }


        }                System.out.println("zuyg tver="+caunt);



    }
}





