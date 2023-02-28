package Gun21;

import java.util.Scanner;

public class _01_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıya aşağıdaki gibi bir menü çıkartarak, kullanıcı çıkış seçeneğini seçene kadar
        // sürekli işlemleri yapınız ve her bir menü için gerekli değerleri parametre alan fonksiyon olarak yazınız.
        /*  1-toplama
            2-çıkarma
            3-çarpma
            4-bolme
            5-Faktöryel
            6-Çıkış
        Bir işlem seçiniz */

        Scanner oku=new Scanner(System.in);
        int secim;
        do{
            menuYaz();
            secim=oku.nextInt();
            if (secim<5) islemYap(secim);

        }while (secim<5);//dönme şartı secim<5

        System.out.println("Çıkış Yapıldı");



    }

public static void menuYaz() {
    System.out.print("1-Toplama\n"+
            "2-Çıkarma\n"+
            "3-Çarpma\n"+
            "4-Bölme\n"+
            "5-Çıkış\n"+
            //Faktöryel menüsünü ekleyelim
            "Seçiminiz=");
}
    public static void islemYap(int secim) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı1=");
        int sayi1 = oku.nextInt();
        System.out.print("Sayı2=");
        int sayi2 = oku.nextInt();

        switch (secim) {

            case 1: System.out.println("Toplam=" + (sayi1 + sayi2));break;
            case 2: System.out.println("Çıkarma=" + (sayi1 - sayi2));break;
            case 3: System.out.println("Çarpımı=" + (sayi1 * sayi2));break;
            case 4: System.out.println("Bölümü=" + (sayi1 / sayi2));break;


        }
    }

}
//TODO: 4 işlem kısmını da ayrı bir fonksiyonda yapalım.
//TODO: Menülere yeni bir seçenek olarak girilen sayıya kadar sayıların çarpımını veren faktöryeli de ekleyelim.