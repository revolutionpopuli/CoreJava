package Gun37._03_Ornek;

public class Geometri {
    public static void main(String[] args) {
        //bir interface nin birden fazla class tarafından implemente edilmesi
       Cember c=new Cember();
       c.ciz();

       Dikdortgen d=new Dikdortgen();
       d.ciz();

       //interface lerden nesne üretilemez fakat referans tipi oluşturulabilir
        //Bu bize polymorphisim sağladı

        ICizdirir c2=new Cember();
        c2.ciz();//direkt olarak sadece interface deki
        //ismi verilmiş olanlar metodlara erişebilirsin

        cizdirme(c);
        cizdirme(d);

    }
    public static void cizdirme(ICizdirir iciz){
        iciz.ciz();
    }
}
