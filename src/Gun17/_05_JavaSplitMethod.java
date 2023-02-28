package Gun17;

import java.util.Arrays;

public class _05_JavaSplitMethod {
    public static void main(String[] args) {

        //Split: bir stringi parçalara ayırır, verilen kritere göre

        String cumle="Bugün hava oldukça soğuk";
        //bir şey verilmezse karakterlerine ayırır

        String[] kelimeler=cumle.split(" ");

                for(int i=0; i< kelimeler.length; i++)
                    System.out.println(i+".kelime = " + kelimeler[i]);

         //Kısa Yazdırma Yolu
        System.out.println("kelimeler = " + Arrays.toString(kelimeler));

    }
}
