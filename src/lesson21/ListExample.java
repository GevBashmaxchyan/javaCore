package lesson21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("poxos");
        names.add("petros");
        names.add("martiros");


        for (int i = 0; i < 10000; i++) {
            names.add("anun" + i);
        }
        print(names);

    }

    static void print(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }
}

