package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi, 10 a kadar olan sayılarla random duldurunuz,
        // sonrasında kullancıdan alacağınız bir sayının dizide olup olmadığını
        // var veya yok diyerek yazdırınız.

        int[] dizi=new int[10];

        for(int i=0; i<dizi.length; i++)
            dizi[i]=(int) (Math.random()*10);

        System.out.println(Arrays.toString(dizi));
            Scanner oku=new Scanner(System.in);
            System.out.print("Sayı Giriniz=");
            int arananSayi=oku.nextInt();

        for(int i=0; i<dizi.length; i++){
            // 2 tane olduğunda da sadece 1 kere var yazsın
            //bulamazsa YOK yazsın
            //bulduktan sonra DEVAM ETMESİN


            if(dizi[i]==arananSayi)
                System.out.println("Var");
            else System.out.println("Yok");
        }





    }


}
