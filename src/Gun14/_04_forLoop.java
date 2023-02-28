package Gun14;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {
        //Girilen bir sayıya (dahil) kadar olan sayıların çarpımını bulunuz
        //2. bölüm: Çarpımın değeri 100 ü geçtiğinde işlem sonlansın

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz=");
        int sinir= oku.nextInt();
        int carpim=1;

        for (int i=1; i<=sinir; i++) {
            carpim = carpim * i;


            if (carpim>100) {
                System.out.println("break çalıştı");
                break;
            }


        }


        System.out.println("carpim = " + carpim);



    }
}
