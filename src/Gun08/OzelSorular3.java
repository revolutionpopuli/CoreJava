package Gun08;

import java.util.Scanner;

public class OzelSorular3 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("Bir sayı giriniz=");
        int sayi= oku.nextInt();

        int yuzlerBasamagi=sayi/100;
        System.out.println("yuzlerBasamagi = " + yuzlerBasamagi);



    }
}
