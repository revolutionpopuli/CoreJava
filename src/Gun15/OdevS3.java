package Gun15;

public class OdevS3 {
    public static void main(String[] args) {
        //Aşağıdaki for döngüsüne denk while döngüsü hangisidir?  (başlangıçta toplam=0 varsayın)
        //for (i = 1; i <= 100; i = i + 1)
        //    toplam = toplam + i;
        
        int sayac=1;
        int toplam=0;

        while (sayac<=100) {
            toplam=toplam+sayac;
            sayac++;
        }

        System.out.println("toplam = " + toplam);
        
    }
}
