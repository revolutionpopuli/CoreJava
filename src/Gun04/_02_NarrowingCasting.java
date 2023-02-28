package Gun04;

public class _02_NarrowingCasting {
    public static void main(String[] args) {
        double oran= 3.2;
        int sayi=5;

        sayi= (int)oran;

        System.out.println("sayi = " + sayi); //3, küsurat gidiyor. int buna müsait değil

        long genelToplam= 370;

        sayi=(int)genelToplam;
        System.out.println("sayi = " + sayi);




    }
}
