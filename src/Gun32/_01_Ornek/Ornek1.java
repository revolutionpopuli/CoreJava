package Gun32._01_Ornek;

public class Ornek1 {

    enum Aylar {
        OCAK, SUBAT, MART, NISAN, MAYIS, HAZIRAN, TEMMUZ, AGUSTOS, EYLUL, EKIM, KASIM, ARALIK
    }

    public static void main(String[] args) {
        Aylar ay = Aylar.MAYIS;

        //verilen ayın gün sayısı bulundu
        switch (ay) {
            case SUBAT:
                System.out.println("28");
                break;
            case OCAK:
            case MART:
            case MAYIS:
            case TEMMUZ:
            case AGUSTOS:
            case EKIM:
            case ARALIK:
                System.out.println("31");
                break;
            case NISAN:
            case EYLUL:
            case KASIM:
            case HAZIRAN:
                System.out.println("30");
                break;
        }

        //okunabilirlik ve kontrollü yazılım için bu yöntem daha sağlıklı

        //bordro programında belli bir ay işlem yaptırma
        if (ay == Aylar.MAYIS) {
            System.out.println("Zam Yapıldı");
        }

        System.out.println("ay = " + ay);//toString
        System.out.println("ay.name() = " + ay.name());//SİMGE olarak kullanılan kelimeyi verir
        System.out.println("ay.ordinal() = " + ay.ordinal());//SİMGE nin indexini verir

        for(Aylar a : Aylar.values())// Enum yapısındaki tüm bilgileri alabiliriz.
            System.out.println(a.name()+":"+a.ordinal());//indexi ve adı


    }
}
