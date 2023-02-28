package Gun08;

public class _02_JavaArithmeticOperators {
    public static void main(String[] args) {

        int sayac=0;

        sayac=sayac+1;//sayacın değerini 1 artırır.
        sayac++; //sayacın değerini 1 artırır.
        ++sayac; //sayacın değerini 1 artırır.

        sayac=sayac-1; //sayacın değerini 1 azalt
        sayac-- ; //sayacaın değerini 1 azalt
        --sayac ; //sayacın değerini 1 azalt

        /**************************/

        int sonuc=0;
        sayac=0;
        sonuc=sayac++; //++ veya -- ler sağ tarafta ise yokmuş gibi işlemi yapacağız sonra ++ veya -- leri yapacağız.

        sonuc=sayac;
        sayac=sayac+1;


        // ++ lar solda

        sonuc=0;
        sayac=0;
        sonuc=++sayac; // ++ veya -- ler sol tarafta ise önce ++ veya -- ler yapılır sonra işlem yapılır.

        sayac=sayac+1;
        sonuc=sayac;





    }
}
