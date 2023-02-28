package Gun10;

import java.util.Scanner;

public class OdevS3 {
    public static void main(String[] args) {

        //Kullanıcıdan ondalıklı bir sayının, tam ve ondalıklı kısmını ayrı  ayrı alınız.
        //bu sayıları  nokta ile birleştirerek tek bır ondalıklı sayı haline getirip, sonra yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı1=");
        int sayi1= oku.nextInt();
        System.out.print("Sayı2=");
        int sayi2=oku.nextInt();

        System.out.println("Ondalık = " + sayi1+"."+sayi2);



    }
}
