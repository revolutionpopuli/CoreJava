package Utility;

public class MyFunc {
    public static double yuvarla(double gelenSayi){
        //18.84955592153876
        //önce yüzle çarpsan->1884.955592153876
        gelenSayi=gelenSayi*100;
        gelenSayi=Math.round(gelenSayi);//1885
        //tekrar 100 e böl
        gelenSayi=gelenSayi/100;
        return gelenSayi;//18.85

    }

    public static void bekle(int saniye){
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
