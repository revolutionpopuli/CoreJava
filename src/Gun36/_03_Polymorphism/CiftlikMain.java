package Gun36._03_Polymorphism;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek kopek1=new Kopek("karabaş");
        //kopek1.ses();
        //kopek1.kokladi();

        Kedi kedi1=new Kedi("kopuk");
        //kedi1.ses();
        //kedi1.tirmaladi();

        kopekSesi(kopek1);
        kediSesi(kedi1);

        hayvanSesi(kopek1);
        hayvanSesi(kedi1);

        /****************************/

        Hayvan hayvan1=new Hayvan("ördek");//hayvanlardan bir hayvan
        Hayvan hayvan2=new Kopek("kangal");//hayvanlardan köpek
        Hayvan hayvan3=new Kedi("kedi");//hayvanlardan kedi
          //referans       nesne türü
        System.out.println("-----------------------");
        hayvan1.ses();//genel hayvan ses çıkardı
        hayvan2.ses();//kopek hayvan havladı
        hayvan3.ses();//kedi hayvan miyavladı
        System.out.println("------------------------");

        hayvan2.ses();//köpek de olsa hayvan referansı sebebiyle metodlar kısıtlı
        //peki bu hayvanın köpek formunu nasıl ortaya çıkartırım
        //tip dönüşümü işe yarar mı
        ((Kopek)hayvan2).kokladi();//artık diğer metodları kullanabilirim
        //((int)Math.random()); casting gibi, tip dönüşümü
        ((Kedi)hayvan3).tirmaladi();

        //Polymorphism -
        // çok formluluk  - Çok çeşitlilik
        //şizofren bir konu
        //
        //:  Bir NESNENİN istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
        //   ve bu şekilde kullanılabilmesine Polymorphism denir.





    }
    public static void kopekSesi(Kopek kopek1){
        kopek1.ses();
    }
    public static void kediSesi(Kedi kedi1){
        kedi1.ses();
    }
    public static void hayvanSesi(Hayvan hayvan){
        hayvan.ses();
    }

}
