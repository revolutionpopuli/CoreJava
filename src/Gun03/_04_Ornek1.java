package Gun03;

public class _04_Ornek1 {
    public static void main(String[] args) {

       // iki kenarı tanımlı olarak verilen bir dikdörtgenin çevresini ve alanını bulunuz.
       // çarpma: * kullanılıyor, x ise harf olarak kullanılıyor.

       int kisaKenar=4;
       int uzunKenar=6;


       int cevre=kisaKenar+kisaKenar+uzunKenar+uzunKenar;
       int alan=kisaKenar*uzunKenar;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);


    }
}
