package Gun46;

public class _01_JavaTryCatchFinally {
    public static void main(String[] args) {

        long startTime=0;
        String str="";

        try{
            startTime=System.currentTimeMillis();
            System.out.println("Hatadan önceki nokta");
            char ilkHarf=str.charAt(0);//hata noktası
            System.out.println("Hatadan sonraki nokta");
        }catch (Exception ex){
            System.out.println("catch bloğu çalıştı");
        }
        finally {//try-catch in finali: her zaman çalışır
            long gecenSure = System.currentTimeMillis()-startTime;
            System.out.println(gecenSure);
            System.out.println("try-catch bloğuyla ilgili son yapılacaklar");
            //hata olsun olmasın çalışan kısım
            //her zaman çalışır
            //işlemlerde geriye kalan yapılacaklar bu bölümde yapılır
            //kullanma sebebi her iki durum sonrası geriye kalan yapılacaklar birlikte olsun diyedir-KOD BÜTÜNLÜĞÜ
        }
        System.out.println("diğer çalışan kodlar");
        System.out.println("program sonu");
    }
}
