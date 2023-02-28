package Gun28._02_Ornek;

public class Soru {
    public static void main(String[] args) {
        // Math sınıfndaki metodlarıdan 5 tanesini
        // kendi isimlendirmenizle ayrı bir sınıfta yazarak,
        // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
        // mainden nesne oluşturmadan direkt kullanılmasını sağlatacak örnek
        // kullanımlarını yazınız.

        MyMath.getMin(4, 5);

        int rndSayi = MyMath.getRandom(10);
        System.out.println("rndSayi = " + rndSayi);

        int rndSayi2 = MyMath.getRandom(5, 10);
        System.out.println("rndSayi2 = " + rndSayi2);

        int roundSayi = MyMath.getRound(3.2345);
        System.out.println("roundSayi = " + roundSayi);


    }
}
