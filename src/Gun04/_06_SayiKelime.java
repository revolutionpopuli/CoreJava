package Gun04;

public class _06_SayiKelime {
    public static void main(String[] args) {

        /*** Stringi sayıya çevirme***/

        String ad="ismet";
        String kelimeSayi="65"; //şu anda bu aynı ad gibi simge yani rakam değil
        //fakat rakam-sayı görünümlü ise sayıya dönüştürebilirim.

        int intDeger=Integer.parseInt(kelimeSayi); // sayı görünümlü simgeyi, sayı(int) dönüştürdü
        System.out.println("intDeger = " + intDeger);
        int toplam= intDeger+5;

        byte byteDeger= Byte.parseByte(kelimeSayi); // sayı görünümlü simgeyi, sayıya (Byte) dönüştürdü

        System.out.println("byteDeger = " + byteDeger);

        /***** sayıları String e çevirmek *****/

        int sicaklik=18;
        //bugün hava sıcaklığı 18 derece
        System.out.println("Bugün hava sıcaklığı "+sicaklik+" derece"); //otomatik stringe dönüştü

        String sicaklikKelimeHali=Integer.toString(sicaklik); //toplanamaz
        //int toplam2=sicaklikkelimeHali+5; yapılamaz çünkü artık string

        System.out.println("Bugün hava sıcaklığı "+sicaklikKelimeHali+" derece");






    }
}
