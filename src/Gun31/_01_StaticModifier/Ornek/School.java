package Gun31._01_StaticModifier.Ornek;

public class School {
    public static void main(String[] args) {
        // Student (id, name, surName)
        // Yukarıdaki gibi 5 öğrenci tanımlayınız.
        // Her öğrencinin takip eden bir id si olmalı.(otomatik artan)
        // Ve en son kaç öğrenci olduğunu bulabilmeliyim.

        Student ogr1=new Student( "ismet temur");
        Student ogr2=new Student( "ahmet demir");
        Student ogr3=new Student( "ayşe yılmaz");
        //problem: hem id yi takip etmek zorunda kalıyorum
        //hata olasılığı yüksek ve gereksiz veri girişi

        //id lere verilecek numaraları takip eden ve her NESNE oluşturuldukça
        //artan sayaç olmalı

        System.out.println("ogr1 = " + ogr1);
        System.out.println("ogr2 = " + ogr2);
        System.out.println("ogr3 = " + ogr3);

        System.out.println("Öğrenci Sayısı = " + Student.sayac);
        //TODO: burada 1 fazla öğrenci gösteriyor -1 yapmadan nasıl çözerdiniz.





    }
}
