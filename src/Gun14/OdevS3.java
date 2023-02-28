package Gun14;

import java.util.Scanner;

public class OdevS3 {
    public static void main(String[] args) {
        //Kullanıcıdan 10 adet sayı isteyiniz, eğer sayı çift ise toplasın, tek ise girdiğinde ise döngü sonlansın.

        Scanner oku=new Scanner(System.in);

        int toplam=0;

        for (int i=1; i<=10; i++) {
            System.out.print(i+ ".Sayıyı Giriniz=");
            int sayi = oku.nextInt();

            if (sayi%2==0) toplam=toplam+sayi;


        }


        System.out.println("toplam = " + toplam);

    }
}
