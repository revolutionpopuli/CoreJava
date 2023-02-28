package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Java2DArrays {
    public static void main(String[] args) {
        //Günün Sorusu= 3x2 lik bir diziyi kullancıdan sayı alarak doldurduktan sonra
        //sadece tek elemanlarını tek boyutlu bir diziye atayınız



        int [][] tablo=new int[3][2]; //3x2 lik bir dizi
        Scanner oku=new Scanner(System.in);

        //Diziyi kullancıdan sayı alarak doldurunuz
        int teklerMiktari=0;
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j <tablo[i].length; j++) {
                System.out.print(i+" "+j+".Sayı=");
                tablo[i][j]= oku.nextInt();

                if(tablo[i][j]%2==1)
                    teklerMiktari++;
            }

        }

        //isteyen yazdırma kısmını eklesin, görmek için.
        System.out.println(Arrays.deepToString(tablo));

        //Doldurduktan sonra
        int[] tekler=new int[teklerMiktari];

        int tekIndex=0;
        for (int i = 0; i < tablo.length ; i++) {
            for (int j = 0; j <tablo[i].length ; j++) {

                if(tablo[i][j]%2==1){

                    tekler[tekIndex]=tablo[i][j];
                    tekIndex++;

                }

            }

        }

        System.out.println(Arrays.toString(tekler));

    }
}
