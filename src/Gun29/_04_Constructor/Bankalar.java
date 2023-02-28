package Gun29._04_Constructor;

public class Bankalar {
    public static void main(String[] args) {
        // Bir banka class ı tanımlayınız.
        // 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
        // 3 adet constructor ekleyin.
        // toString metodu oluşturun.
        // 3 tane nesne oluşturup mainde yazdırınız.


        Banka bnk1=new Banka("A Bank", 121, 1999);
        Banka bnk2 = new Banka("B Bank", 50, 2005);
        Banka bnk3 = new Banka("C Bank", 50);

        System.out.println("bnk1 = " + bnk1);
        System.out.println("bnk2 = " + bnk2);
        System.out.println("bnk3 = " + bnk3);



    }
}
