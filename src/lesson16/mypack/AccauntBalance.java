package lesson16.mypack;

public class AccauntBalance {
    public static void main(String[] args) {
        Balance current[] = new Balance[3];

        current[0] = new Balance("K.J.Fielding",123.23);
        current[0] = new Balance("Will Tell",152.02);
        current[0] = new Balance("Tom Jeckson",-12.33);

        for (int i = 0; i < 3; i++)
            current[i].show();

    }
}
