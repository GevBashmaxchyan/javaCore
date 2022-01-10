package lesson22;



import lesson11.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
//        Map<String, Student> studentMap = new HashMap<>();
//        studentMap.put("poxos@mail.ru", new Student("poxos","poxosyan",12,"poxos@mail.ru","java"));
//
//        Set<String> strings = studentMap.keySet();

        Map<String, Integer> map = new TreeMap<>();
        map.put("poxos@mail.ru",21);
        map.put("arto@mail.ru",41);
        map.put("bagrat@mail.ru",31);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }

    }
}
