package Gun30._02_PrivateErisim;

public class Sirket {
    public static void main(String[] args) {

        Calisan cal1=new Calisan();

        cal1.id=1;
        cal1.name="ismet";
        //cal1.password="123"; //sifreye direkt erişiliyor
        //kontrolsüz atandı.
        //erişime kapalı olmalı
        //bunun yerine classa metod eklendi

        cal1.sifreAta("123");
        cal1.sifreAta("wew32322323");
        cal1.sifreGoster();




    }
}
