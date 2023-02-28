package Gun23;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {

        /********************/
        int sayi=5;//tek bir sayı tutabilen değişken
        int[] dizi=new int[20];//20 adet sayı tutabilen değişken, uzunluk sabit
        int[][] tablo=new int[20][2];//20x2 lik sayı saklayabilen değişken, uzunluk sabit

        ArrayList<Integer> liste=new ArrayList<>(); // istenildiği kadar sayı eklenebilen değişken, uzunluk değişken
        /*********************/

        ArrayList<Integer>matNotlari=new ArrayList<>();//tek bir dersin notları// 1 yaprak
        ArrayList<Integer>fizNotlari=new ArrayList<>();//fizik dersinin notları// 1 yaprak
        ArrayList<Integer>kimNotlari=new ArrayList<>();//kimya dersinin notları// 1 yaprak

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizNotlari.add(30);
        fizNotlari.add(40);

        kimNotlari.add(60);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);

        //Arraylistin Arraylisti nasıl yapılır
        ArrayList<ArrayList<Integer>>notlarlistesi=new ArrayList<>();
        notlarlistesi.add(matNotlari);
        notlarlistesi.add(fizNotlari);
        notlarlistesi.add(kimNotlari);

        //Bütün ders notları notlar listesinde şu anda, yani Arraylistlerin listesi

        notlarlistesi.get(0);//matNotları her bir elemanı liste çünkü
        int matbirNot=notlarlistesi.get(0).get(0);//0. listenin 0. elemanı, mat ın 1. notu

        System.out.println("notlarlistesi.get(0) = " + notlarlistesi.get(0));//0. listeyi verdi
        System.out.println("notlarlistesi.get(1) = " + notlarlistesi.get(1));//1. listeyi verdi
        System.out.println("notlarlistesi.get(2) = " + notlarlistesi.get(2));//2.listeyi verdi

        //yukardakilerin yerine döngü
        for (int i = 0; i <notlarlistesi.size() ; i++) {
            System.out.println("notlarlistesi = " + notlarlistesi);
        }

        for (int i = 0; i <notlarlistesi.size() ; i++) {//satırları takip ediyor, satır
            for (int j = 0; j <notlarlistesi.get(i).size() ; j++) {//her satırdaki sütunları
                System.out.print(notlarlistesi.get(i).get(j)+"\t");
            }
            System.out.println();
        }

    }
}
