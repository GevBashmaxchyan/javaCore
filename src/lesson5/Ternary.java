package lesson5;

public class Ternary {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i;
        System.out.print("yndanur nshanakutyun ");
        System.out.println(i + "havasar e" + k);
        i = -10;
        k = i < 0 ? -i : i;
        System.out.print("yndanur nshanakutyun ");
        System.out.println(i + "havasar e " + k);

    }
}
