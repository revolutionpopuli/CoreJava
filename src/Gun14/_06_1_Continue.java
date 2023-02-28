package Gun14;

import java.util.Scanner;

public class _06_1_Continue {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir String Giriniz=");
        String cumle= oku.nextLine();
        //cumle.lenght: stringin uzunluğunu verir
        //cumle.CharAt(5):5 indexteki karakteri verir

        for (int i=0; i<cumle.length(); i++ ){

            if (cumle.charAt(i)==' ') continue;// çalıştığında sonraki satırları pas geçer

            System.out.println(cumle.charAt(i));// index sıfırdan başlar

        }




    }
}
