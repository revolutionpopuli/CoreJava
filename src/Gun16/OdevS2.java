package Gun16;

public class OdevS2 {
    public static void main(String[] args) {
       //int Array oluşturun ve elemanları : 12,2,5,15,8
        //En büyük değeri yazdırınız.

        int[] dizi={12,2,5,15,8};
        int enbBuyuk=dizi[0];

        for(int i=0; i< dizi.length;i++)
            if(dizi[i]>enbBuyuk)
               enbBuyuk=dizi[i];
        System.out.println("enbBuyuk = " + enbBuyuk);


    }
}
