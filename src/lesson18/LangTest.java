package lesson18;

import java.util.Scanner;

public class LangTest {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Lang[] values = Lang.values();
        System.out.println("please choose language");
        for (Lang value : values) {
            System.out.print(value + " ");
        }
        String lang = scanner.nextLine();
        try {

            Lang userlang = Lang.valueOf(lang.toUpperCase());
            System.out.println(userlang);
            System.out.println(userlang.getCauntryName());
            System.out.println(userlang.getCaunt());
            System.out.println(userlang.ordinal());

        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
