package Gun10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Girilen vize(%40) ve final(%60) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük-eşit ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Vize=");
        int vizenotu= oku.nextInt();
        System.out.print("Final=");
        int finalnotu=oku.nextInt();

        double ortalama=(vizenotu*0.4)+(finalnotu*0.6);//int ortalama=(int)(0.4*vizeNotu)+(int)(0.6*finalnotu)

        if (ortalama>=60) {
            System.out.println("Tebrikler, geçtiniz, ortalama="+ortalama);
        }

        else {
            System.out.println("Bütünlemeye Kaldınız, ortalama="+ortalama);
        }

    }
}
