package Lesson6;

public class IfElse {
    public static void main(String[] args) {

        int month = 4;
        String season;
        if (month == 12 || month == 1 || month == 2)
            season = " dzmer";
        else if (month == 3 || month == 4 || month == 5)
            season = " garun";
        else if (month == 6 || month == 7 || month == 8)
            season = " amar";
        else if (month == 9 || month == 10 || month == 11)
            season =" ashun";
        else
            season ="anhayt";
        System.out.println("aprily patkanum e "+ season+".");

    }
}
