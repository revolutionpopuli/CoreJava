package Gun05;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {
     //Kullanıcıdan alacağınız 2 tam sayının toplamını ekrana yazdırınız

        Scanner oku=new Scanner(System.in);

        System.out.print("sayi1=");
        int sayi1= oku.nextInt();

        System.out.print("sayi2=");
        int sayi2= oku.nextInt();

        int toplam=sayi1+sayi2;
        System.out.println("toplam = " + toplam);

        System.out.println(sayi1 + sayi2);//sayıları toplar
        System.out.println("sonuc1=" + sayi1 + sayi2);//parantez olmazsa sayıları yan yana yazar
        System.out.println("sonuc2=" + (sayi1 + sayi2));//sayıları  toplar







    }
}
