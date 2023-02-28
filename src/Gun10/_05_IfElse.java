package Gun10;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır
        // hayır yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle Giriniz=");
        String cumle= oku.nextLine();

        int uzunluk=cumle.length();
        System.out.println("uzunluk = " + uzunluk);

        if (uzunluk>=10 && cumle.contains("study")) {
            System.out.println("Evet");
        }

        else {
            System.out.println("Hayır");
        }

        //if (cumle.lenght() >10 && cumle.contains ("study")
        //if (cumle.lenght() >10 && cumle.toLowerCase().contains ("study")

    }
}
