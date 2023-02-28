package Gun16;

public class _05_JavaArray {
    public static void main(String[] args) {

        // 5 tv kanalı ismini bir diziye doldurunuz.
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazıdırınız

        String[] kanallar= {"trt","kanald","fox", "habertürk","ntv"};

        int secilen=(int) (Math.random()* kanallar.length); //0 1 2 3 4
        System.out.println("kanallar = " + kanallar[secilen]);

        //TODO:günün sorusu:bir döngü ile 5 tane buldurunuz
        //fakat  bir buldu mu tekrar bulmasın

    }
}
