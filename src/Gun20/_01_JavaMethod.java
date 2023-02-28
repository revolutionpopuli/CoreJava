package Gun20;

public class _01_JavaMethod {
    public static void main(String[] args) {//ana çalışan kısmı burası, buradan diğerlerini çağıracağız
        Math.max(5,6);//bir şeyler gönderiliyor, geriye değer alınıyor
        Math.random();//bir şeyler gönderilmiyor, geriye değer alınıyor

        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        merhabaYaz(); //kullanımı kolay, çağırması kolay, tekrar tekrar kullanabilirsin
        merhabaYaz(); //main daha kolay ve anlaşılır olur
        merhabaYaz(); //fonksiyonu çağırma şekli


    }//mainin bitişi

    //burası metodların yazılabileceği yerler
    public  static void merhabaYaz() {
        System.out.println("fonksiyonda/metotda Merhaba Dünya");
    }

    // Metodlar tekrarlayan kodlardan kurtulup bir kere yazıp sonra tekrar çağırmak için
    // ve büyük programı parçalara bölüp kod karışıklığının önüne geçmek için kullanılır.
    // temiz kod için
}
