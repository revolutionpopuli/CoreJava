package Gun44._01_ZamanDigerIslemler;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _02_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
        //Kullanıcıdan alınan ve String durumunda olan bir time veya tarih
        //bilgisinin time veya tarih değişkenine çevrilmesi

        long startTime=System.currentTimeMillis();//kodun performansını öğrenmek için yaptık
        Scanner oku=new Scanner(System.in);
        System.out.print("Tarih Giriniz (25 01 2020)=");
        String strTarih=oku.nextLine();
        
        //Kullanıcının gireceği formata göre format oluşturduk
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd MM yyyy");
        
        //Stringin formatı bu formata uygun olmalı, parse ile çevirdik
        LocalDate tarih=LocalDate.parse(strTarih, f);

        System.out.println("tarih = " + tarih);
        System.out.println("tarih.format(f) = " + tarih.format(f));

        long finishTime=System.currentTimeMillis();
        System.out.println("geçen süre="+(finishTime-startTime)+" ms");
        
        
        
    }
}
