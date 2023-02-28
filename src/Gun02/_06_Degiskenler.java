package Gun02;

public class _06_Degiskenler {
    public static void main(String[] args) {
        // Değişkenler- Variable
        int sayi; // int: tam sayı saklayacak kadar hafızada yer ayırıyor ve onun adına sayı diyor.
        // değişkenin adı: sayı, tipi: int, int (integer): tam sayı

        int saYi; // bir harf bile farklı olsa farklı değişkendir.
        int SAYI; // büyük harf ve küçük harf farklı değişken demektir.
        // Java büyük küçük harf duyarlı (case sensitive) dildir.
        sayi=5; // sayının değeri 5 oldu
        System.out.println("sayi"); // çift tırnak arasındaki her şey ekrana direkt yazılır.
        System.out.println(sayi); // değişkenin adını direkt yazarsak DEĞERİNİ yazar.

        System.out.println("sayi="+sayi); // sayi=5

        sayi=7; // sayının değeri 7 oldu

        int kisaKenar=5;
        int uzunKenar=7;

        int cevre= kisaKenar+kisaKenar+uzunKenar+uzunKenar;

        System.out.println("Çevresi="+cevre);




    }
}
