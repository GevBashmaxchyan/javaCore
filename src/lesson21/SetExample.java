package lesson21;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String>names = new TreeSet<>();
        names.add("poxos");
        names.add("petros");
        names.add("martiros");
        names.add("aram");

        for (String name : names) {
            System.out.println(name);
        }

    }
}
