package Gun13;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {
        // Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        Scanner oku=new Scanner(System.in);
        String okunan=""; //String in sıfırı(=0) tanımlamak için
        do{
            System.out.println("Program Çalışıyor");
            System.out.print("İfade giriniz=");
            okunan= oku.next();



        }while (!okunan.equalsIgnoreCase("x"));

        System.out.println("Program Bitti");







    }
}
