package Gun08;

import java.util.Scanner;

public class OzelSorular1 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz=");
        int sayi= oku.nextInt();

        int birlerBasamagi=sayi%10;
        System.out.println("birlerBasamagi = " + birlerBasamagi);



    }
}
