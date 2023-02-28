package Gun04;

public class _04_Ornek2 {
    public static void main(String[] args) {

        // 1 tane double ve 1 tane short değişken tanımlayınız,
        // değer atayınız, sonra double değişkeni short değişkene çevirerek,
        // bütün değerleri ekrana yazdırınız.

        double oran=3.2;
        short kisa=2;

        System.out.println("önce kisa = " + kisa);
        kisa= (short)oran; // değer sığabildiği için tam sayı kısmını alır, ondalıklı kısım alınamaz

        oran=3000000.2;
        kisa=(short)oran;// short en fazla 32767 değeri alabilir.
        System.out.println("sonra kisa = " + kisa);
        // hem tam sayı kısmı sığmıyor hem de ondalıklı kısım atılamıyor
        // tamamen değer kayboluyor




    }

}
