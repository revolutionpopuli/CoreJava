package Gun45._02_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavaTryCatch {
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

            }catch (InputMismatchException ex) {
                System.out.println("Lütfen sayı giriniz");
                i--;
            }catch (ArithmeticException ex) {
                System.out.println("Sıfıra bölme hatası");
                i--;
            }catch (Exception ex) {//yukarıdakilerin dışında genel bir hata olursa
                System.out.println("Lütfen tekrar deneyiniz");
                i--;
            }
        }
        System.out.println("Program bitti");




    }
}
