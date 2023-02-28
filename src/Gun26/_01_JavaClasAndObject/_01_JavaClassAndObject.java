package Gun26._01_JavaClasAndObject;

public class _01_JavaClassAndObject {
    //metodların yazıldığı yer
    public static void main(String[] args) {
        //programın başladığı yer, ilk bu noktadan sonra çalışmaya başlar

        Araba benimArabam=new Araba();

        benimArabam.modelYili=2020;
        benimArabam.motorHacmi=1500;
        benimArabam.renk="kırmızı";
        benimArabam.plaka="06ABC123";

        System.out.println("benimArabam.plaka = " + benimArabam.plaka);
        System.out.println("benimArabam = " + benimArabam.renk);
        System.out.println("benimArabam.modelYili = " + benimArabam.modelYili);
        System.out.println("benimArabam.motorHacmi = " + benimArabam.motorHacmi);




    }
    //metodların yazıldığı yer
}

class Araba {//bu bölüme class diyoruz.bu bize özgü tipimiz.
    
    int modelYili;
    String renk;
    double motorHacmi;
    String plaka;
    
        }