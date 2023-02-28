package Gun10;

import java.util.Scanner;

public class OdevS7 {
    public static void main(String[] args) {

        //Girilen Bir öğrencinin notunu belirleyen bir Java programı yazın.
        //Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:
        //Eğer ortalama not >=90 =>not=A
        //Eğer ortalama not >= 70 ve<90 => not=B
        //Eğer ortalama not >=50 ve <70 =>not=C
        //Eğer ortalama not <50 =>note=F
        //Aşağıdaki örnek çıktıya bakın:
        //int Quiz_score: 80
        //int mid_term_score: 68
        //int Final_score: 90
        //print (Your grade is B)
        //          (Notunuz B'dir)

        Scanner oku=new Scanner(System.in);
        System.out.print("Sınav=");
        int sinav= oku.nextInt();
        System.out.print("Ara Sınav=");
        int arasinav= oku.nextInt();
        System.out.print("Final Notu=");
        int finalnotu= oku.nextInt();

        double ortalama=(sinav+arasinav+finalnotu)/3;

        if (ortalama>=90) {
            System.out.println("not=A");
        }

        if (ortalama>70 && ortalama<90) {
            System.out.println("not=B");
        }

        if (ortalama>=50 && ortalama<70) {
            System.out.println("not=C");
        }

        if (ortalama<50) {
            System.out.println("not=F");
        }

    }
}
