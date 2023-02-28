package Gun21;

public class _02_JavaMethod {
    public static void main(String[] args) {

     merhabaYaz();//giden yok, dönen yok
     toplamYaz(4,5);//giden var, dönen yok (fonksiyonu bir şeye eşitliyor musun)
     int enb=Math.max(4,5);// giden var, dönen var
     double sayi=Math.random();// giden yok, dönen var.

        //******************************//
     enbYaz(4,5);//giden var 4,5 ama dönen yok

     int donen=enBul(4,5);//giden var, dönen de var.
        System.out.println("donen"+donen);



    }

    public static void merhabaYaz() {
        System.out.println("Merhaba");
    }

    public static void toplamYaz(int sayi1, int sayi2){

        System.out.println(sayi1+sayi2);
    }

    public static void enbYaz(int sayi1, int sayi2){
        if(sayi1>sayi2)
            System.out.println("sayi1 = " + sayi1);
        else
            System.out.println("sayi2 = " + sayi2);
    }

    public static int enBul(int sayi1, int sayi2)//dönecek tip
    {
        int donecek=0;
        if(sayi1>sayi2)
            donecek=sayi1;
        else donecek=sayi2;

        return donecek;//dönecek olan değişken yazılıyor, fonksiyonun adından önceye de dönecek olan değişkenin tipi yazılır
    }
}
