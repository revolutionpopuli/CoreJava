package Gun45._02_ExceptionHandling;

import java.util.Scanner;

public class _02_JavaRuntimeException {
    public static void main(String[] args) {
        System.out.println("Program başladı");


        for(int i=0; i<3; i++) {
            Scanner oku=new Scanner(System.in);
            try {//hata bölgesini try{} ine aldık
                System.out.print("Sayi1=");
                int sayi1 = oku.nextInt();
                System.out.print("Sayi2=");
                int sayi2 = oku.nextInt();
                System.out.println("bölüm=" + (sayi1 / sayi2));

            }catch (Exception hataBilgileri){//hata mesajlarını hata isimli Exception cinsinden değişkene
                System.out.println("hataBilgileri = " + hataBilgileri.getMessage());
                i--;
            }
        }
        System.out.println("Program bitti");
    }
}
