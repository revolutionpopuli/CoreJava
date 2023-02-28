package Gun42;

import Utility.MyFunc;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Soru {
    public static void main(String[] args) {
        //Canlı digital saat yapınız

        DateTimeFormatter f=DateTimeFormatter.ofPattern("hh:mm:ss");

        while (true) {
            LocalTime saat = LocalTime.now();
            System.out.print( "\r" +saat.format(f));
            MyFunc.bekle(1);

        }
    }
}
