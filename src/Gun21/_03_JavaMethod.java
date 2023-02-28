package Gun21;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı1=");
        int sayi1= oku.nextInt();
        System.out.print("Sayı2=");
        int sayi2= oku.nextInt();

        int enb=enbBul(sayi1, sayi2);
        System.out.println("enb = " + enb);


    }
    public static int enbBul (int s1, int s2) {

       int donecek=0;
       donecek=s1>s2 ? s1:s2;

       // if(s1>s2)
       //     donecek=s1;
       //     else
        //        donecek=s2;

        return donecek;



    }
}
