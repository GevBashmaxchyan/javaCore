package lesson16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) throws ParseException {
        //01/12/2021 23:13:33
        SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");

        Date date =  new Date();
        System.out.println(sdf.format(date));


    }

}
