package Gun16;

public class OdevS5 {
    public static void main(String[] args) {

        //int Array oluşturun ve elemanları : 5,6,8,12,14,19
        //Eğer sayı çiftse topla, tekse çıkar.
        //**Örneğin:**
        // **-5 + 6 + 8 + 12 + 14 - 19 = 16**
        //Toplamlarını yazdırın.

        int dizi[]={5,6,8,12,14,19};
        int ciftToplam=0;
        int tekToplam=0;
        int toplam=0;

        for(int i=0; i< dizi.length; i++) {

            if(dizi[i]%2==0)
                ciftToplam=ciftToplam+dizi[i];}

        for(int i=0; i< dizi.length; i++){
            if(dizi[i]%2==1)
                tekToplam=tekToplam-dizi[i];


        }

        toplam=ciftToplam+tekToplam;

        System.out.println("toplam = " + toplam);
    }
}
