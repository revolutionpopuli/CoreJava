package Gun42;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaLocalTime {
    public static void main(String[] args) {
        
        //Tarih içermez, sadece saat, dak, san, nano sn içerir
        
        LocalTime zaman= LocalTime.now();
        System.out.println("zaman = " + zaman);

        System.out.println("zaman.getHour() = " + zaman.getHour());
        System.out.println("zaman.getMinute() = " + zaman.getMinute());
        System.out.println("zaman.getSecond() = " + zaman.getSecond());
        System.out.println("zaman.getNano() = " + zaman.getNano());
        
        //kendimize özel format
        DateTimeFormatter of1=DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("zaman.format(of1) = " + zaman.format(of1));
        
        DateTimeFormatter of2=DateTimeFormatter.ofPattern("kk:mm");
        System.out.println("zaman = " + zaman.format(of2));

        DateTimeFormatter of3=DateTimeFormatter.ofPattern("k:mm");
        System.out.println("zaman = " + zaman.format(of3));

        /**************************************/

        LocalTime zaman1=LocalTime.of(7,35,45);
        System.out.println("zaman.format(of3) = " + zaman.format(of3));
        
        
    }
}
