package Gun16;

public class OdevS4 {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        //Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

        int[] dizi={15,25,22,18,30};

        int enBuyuk=dizi[0];
        int enBuyuk2=dizi[0];

        for(int i=0; i< dizi.length; i++) {
            if (dizi[i]>enBuyuk)
                enBuyuk=dizi[i];}
        for(int i=0; i< dizi.length; i++)
            if(enBuyuk2<dizi[i] && enBuyuk>dizi[i])
                enBuyuk2=dizi[i];
        System.out.println("enBuyuk2 = " + enBuyuk2);
        System.out.println("enBuyuk = " + enBuyuk);


    }
}
