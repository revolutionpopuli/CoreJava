package Gun28._03_Ornek;

import java.util.ArrayList;

public class Student {
    String name;
    int maxSaat;
    ArrayList<Lesson> dersleri=new ArrayList<>();

    void dersEkle(Lesson yeniDers){
        //şu ana kadar kaç dersi var
        //geleni ekleyip max saati geçip
        //geçmediğini kontrol etmem gerekiyor

        int aldigiToplamSaat=0;
        for(Lesson d:dersleri)
            aldigiToplamSaat=aldigiToplamSaat+d.saat;
        if(aldigiToplamSaat+yeniDers.saat>maxSaat)
            System.out.println("Max ders saati aşıldı. Ders eklenemedi");
        else
      dersleri.add(yeniDers);


    }

    void dersleriYazdir(){

        System.out.println("******Transkript******");
        System.out.println("Sayın "+name);
        System.out.println("Aldığınız dersler aşağıdadır");
        for (Lesson d: dersleri)
            System.out.println(d.name+" "+d.saat);

    }

    static void universiteKurallari(){
        System.out.println("Kural1:Uykunu mutlaka al, erken yat");
        System.out.println("Kural2:Her zaman dinç ve dinamik ol");
        System.out.println("Kural3:Azimli ve kararlı ol");


    }

}
