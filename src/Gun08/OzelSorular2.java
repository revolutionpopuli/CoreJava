package Gun08;

import java.util.Scanner;

public class OzelSorular2 {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.print("Bir sayı giriniz=");
        int sayi= oku.nextInt();
        int onlarBasamagi=(sayi%100)/10;
        System.out.println("onlarBasamagi = " + onlarBasamagi);



    }
}
