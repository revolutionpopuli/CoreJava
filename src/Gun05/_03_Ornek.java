package Gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        //kullanıcıdan adını ve soyadını alarak ekrana yazdırınız

        Scanner okuyucu=new Scanner(System.in); //okuma işlemini yapacak olan değişken tamamlandı.
        System.out.print("ad ve soyadı giriniz"); //ekrana neyin girilecini yazdık, bilgilendirme.
        String adsoyad= okuyucu.nextLine(); //okuma işlemi bu noktada yapılıyor.
        System.out.println("adSoyad = " + adsoyad); // verinin gerçekten okunabildiğini tekrar ekrana yazarak kontrol ettim.




    }
}
