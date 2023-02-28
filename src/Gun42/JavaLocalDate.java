package Gun42;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class JavaLocalDate {
    public static void main(String[] args) {
        //LocalDate sadece Gün, Ay, Yıl bilgisi tutar

        LocalDate tarih=LocalDate.now();
        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih. = " + tarih.getDayOfWeek());
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());

        //Kendisinde  varolan default formatlar
        System.out.println("tarih.format(DateTimeFormatter.ISO_DATE) = " + tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));


        System.out.println("\n****************************");
        //Localde aldığım tarihi istediğim ülkenin formatına göre, diline göre nasıl gösteririm?

        System.out.println("tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));
        //en-us: birincisi dili, ikincisi ülkeyi temsil ediyor
        //en-uk
        //fr-CA:Kanada Fransızca
        //en-CA:kanada İngilizce

        Locale[] kullanilabilirLokaller=Locale.getAvailableLocales();
        for(Locale l:kullanilabilirLokaller){

            if(l.getDisplayCountry().toLowerCase().contains("chi"))//istenen ülkeye göre süzüldü
                System.out.println(" Dil="+l.getDisplayLanguage()+" Ülke="+l.getDisplayCountry()+" "+l.getLanguage()+" "+l.getCountry());
        }

        Locale lokalCince=new Locale("zh","CN");
        System.out.println("FULL local Türkçe="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalCince)));
        /**********************************************************************************/

        System.out.println("\n****************************");
        //İstediğim formatta gösterim
        System.out.println("tarih = " + tarih);

        DateTimeFormatter ozelFormat1=DateTimeFormatter.ofPattern("dd/MM/yyy");
        System.out.println("tarih  dd/MM/yyy= " + tarih.format(ozelFormat1));

        DateTimeFormatter ozelFormat2=DateTimeFormatter.ofPattern("dd.MM yyy");
        System.out.println("tarih  dd.MM yyy= " + tarih.format(ozelFormat2));

        DateTimeFormatter ozelFormat3=DateTimeFormatter.ofPattern("EEE dd.MM.yyy");
        System.out.println("tarih  EEE dd.MM.yyy= " + tarih.format(ozelFormat3));

        DateTimeFormatter ozelFormat4=DateTimeFormatter.ofPattern("EE dd.MM.yyy");
        System.out.println("tarih  EE dd.MM.yyy= " + tarih.format(ozelFormat4));

        System.out.println("özel format ve dil="+tarih.format(ozelFormat3.withLocale(Locale.UK)));

        System.out.println("\n****************************");

        //Kendimiz bir tarihi nasıl set edebiliriz, oluşturabiliriz, int sayi=5;
        
        LocalDate tarih1=LocalDate.of(2020,6,1);
        System.out.println("tarih1 = " + tarih1);
        LocalDate tarih2=LocalDate.of(2022, Month.AUGUST,6);
        System.out.println("tarih2 = " + tarih2);
        System.out.println("tarih2.format(ozelFormat2) = " + tarih2.format(ozelFormat2));



    }

}
