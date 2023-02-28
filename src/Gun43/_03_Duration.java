package Gun43;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _03_Duration {
    public static void main(String[] args) {
        //Duration hem LocalTime hem de LocalDateTime nin kendi aralarındaki
        //farkı verir yani saatin olduğu zamanlar arasındaki farkı bu şekilde buluyoruz.
        
        //LocalTime
        LocalTime dersBaslangic=LocalTime.of(8,30);
        LocalTime dersBitis=LocalTime.of(11,15);

        Duration GunlukDersSaati=Duration.between(dersBaslangic, dersBitis);
        System.out.println("GunlukDersSaati = " + GunlukDersSaati);
        System.out.println("GunlukDersSaati.toHours() = " + GunlukDersSaati.toHours());
        System.out.println("GunlukDersSaati.toMinutes() = " + GunlukDersSaati.toMinutes());
        System.out.println("GunlukDersSaati.toMillis() = " + GunlukDersSaati.toMillis());;
        
        //LocalDateTime 2 tarih-saat arasındaki fark
        LocalDateTime from=LocalDateTime.of(2022,1,1,0,0);
        LocalDateTime to=LocalDateTime.now();
        
        Duration farkZaman=Duration.between(from,to);
        
        System.out.println("farkZaman = " + farkZaman);
        System.out.println("farkZaman.toDays() = " + farkZaman.toDays());
        System.out.println("farkZaman.toHours() = " + farkZaman.toHours());
        System.out.println("farkZaman.toMinutes() = " + farkZaman.toMinutes());
        
        
        
        
        
        
        
        
    }
}
