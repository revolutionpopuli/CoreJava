package Gun19;

import java.util.Scanner;

public class _04_Java2DArray {
    public static void main(String[] args) {

        //2 ye 3 lük bir tabloyu kullanıcıdan sayı olarak doldurunuz
        //daha sonra ayrı bir döngüde büyük sayıyı bulunuz

        Scanner oku=new Scanner(System.in);
        
        int[][] tablo=new  int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(i+","+j+".Sayı Giriniz=");
                tablo[i][j]= oku.nextInt();
            }
        }

        int enb=0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if(tablo[i][j]>enb)
                    enb=tablo[i][j];
            }
        }
        System.out.println("En Büyük="+enb);
    }
}
