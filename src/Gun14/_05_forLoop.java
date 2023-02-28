package Gun14;

public class _05_forLoop {
    public static void main(String[] args) {
        //2 ler çarpım tablosunu, tablo olarak yazdırınız.

        for (int i=1; i<=10; i++) {
            if (i>5 && i<=7) // 5 ile 7 arasındaysa
                continue; //kendinden sonra gelenleri çalıştırır, döngüyü kırmaz pas geçirir



            System.out.println("2x" + i + "=" + (2 * i));


        }

    }
}
