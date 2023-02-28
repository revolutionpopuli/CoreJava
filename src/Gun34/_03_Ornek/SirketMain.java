package Gun34._03_Ornek;

public class SirketMain {
    public static void main(String[] args) {

    Calisan cal1=new Calisan("ismet temur", 5000, 20);
        System.out.println("cal1.maasHesapla() = " + cal1.maasHesapla());
        System.out.println("cal1 = " + cal1);

     
        GenelMudur gm=new GenelMudur("Ali Can", 10000, 15, 1000);
        System.out.println("gm.maasHesapla() = " + gm.maasHesapla());
        System.out.println("gm = " + gm);
        
        
    }
}
