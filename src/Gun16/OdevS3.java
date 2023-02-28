package Gun16;

public class OdevS3 {
    public static void main(String[] args) {

        //int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        //En küçük (minimum) sayıyı yazdırınız.

        int[] dizi={14,19,5,21};
        int enKucuk=dizi[0];

        for(int i=0; i< dizi.length; i++)
            if(dizi[i]<enKucuk)
                enKucuk=dizi[i];
        System.out.println("enKucuk = " + enKucuk);


    }
}
