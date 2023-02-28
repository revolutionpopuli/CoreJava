package Gun16;

import java.util.Scanner;

public class _01_JavaArray {
    public static void main(String[] args) {

        int sayi=0; // daha önce değişkeni bu şekilde tanımlıyorduk, bir tane yer açtı hafızada
        int [] dizi=new int[5]; // 0,1,2,3,4 indexli 5 adet sayılık yer açtı

        dizi[0]=455;
        dizi[1]=56;
        //dizi[5]=45; // bu olamaz Challenger patlar, en son 4 olabilir,01234

        System.out.println("dizi.length = " + dizi.length);// bu bana kaç eleman olduğunu verir

        Scanner oku=new Scanner(System.in);
        for(int i=0; i<dizi.length; i++) {
            System.out.print("Sayı Giriniz=");
            dizi[i]= oku.nextInt();
        }

        System.out.println("dizi = " + dizi[4]);

        for(int i=0; i< dizi.length;i++)
            System.out.println(dizi[i]);
    }
}
