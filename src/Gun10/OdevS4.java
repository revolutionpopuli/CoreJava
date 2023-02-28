package Gun10;

import java.util.Scanner;

public class OdevS4 {
    public static void main(String[] args) {
        //Girilen bir sayı
        //Eğer int 9'a bölününce kalan 0 ise ve 5'e bölününce kalan 0 ise "Able to divide by 9 and 5" yazdırın.
        //Eğer int 4'e bölününce kalan 0 ise ve 5'e bölünüce kalan 0 ise "Able to divide by 4 and 15" yazdırın.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz=");
        int sayi= oku.nextInt();

        if (sayi%9==0 && sayi%5==0) {
            System.out.println("Able to divide by 9 and 5");
        }
        else {
            System.out.println("Not able to divide by 9 and 5");
        }

        if (sayi%4==0 && sayi%15==0) {

            System.out.println("Able to divide by 4 and 15");
        }

        else {
            System.out.println("Not able to divide by 4 and 15");
        }




    }
}
