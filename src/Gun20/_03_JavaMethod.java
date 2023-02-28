package Gun20;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {

        tekMiCiftMi();
        tekMiCiftMi();

        //kullanıcıdan bir sayı alarak tek mi çift mi yazdırınız
        tekMiCiftMi();
        tekMiCiftMi();
        tekMiCiftMi();



    }

    public  static void tekMiCiftMi(){
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz=");
        int sayi= oku.nextInt();
        //tekMiCiftMi
        if(sayi%2==0)
            System.out.println("Çift");
        else
            System.out.println("Tek");


    }

    public  static void tekMiCiftMi(int sayi){

        if(sayi%2==0)
            System.out.println("Çift");
        else
            System.out.println("Tek");
    }

}
