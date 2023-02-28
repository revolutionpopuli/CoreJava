package Gun21;

public class _07_JavaMethod {
    public static void main(String[] args) {

        int s1=4;
        int s2=12;
        int s3=34;
        int s4=45;

        int sonuc1=toplam(s1,s2);
        int sonuc2=toplam(s1,s2,s3);
        int sonuc3=toplam(s1,s2,s3,s4);
        //parametreler aynı tip sadece miktarlar farklı
        //bu tip durumlar için kolaylık sağlanmış


        System.out.println("sonuc1 = " + sonuc1);
        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc3 = " + sonuc3);

    }
    //gelen kaç sayı olursa olsun hepsini al dizi şeklinde metoda al
    public static int toplam(int... sayilar){
        int toplam=0;
        for (int i = 0; i < sayilar.length; i++)
            toplam=toplam+sayilar[i];

            return toplam;

    }
}
