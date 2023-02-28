package Gun11;

public class _08_JavaRandom {
    public static void main(String[] args) {

        //Soru: 0 ile 6 (hariç) arasında random sayı üreten programı yazınız.

        double doubleRandomSayi=Math.random(); //0.0-0.99999 arası sayı üretiyor

        //0 ile 6 arasında random sayı
        int intrandomSayi=(int)  (doubleRandomSayi*6); //0-5.99 (int) 0-5

                //direkt yöntem
        System.out.println((int) (Math.random()*6) ); //0-5 arası verir


    }

}
