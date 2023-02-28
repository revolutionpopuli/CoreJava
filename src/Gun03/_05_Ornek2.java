package Gun03;

public class _05_Ornek2 {
    public static void main(String[] args) {
        // yarıçapı (r) verilen bir dairenin çevresini ve alanını bulunuz
        // alan=pi*r*r çevre=2*pi*r pi:3.14

        double yaricap=2.34;
        double alan= 3.14*yaricap*yaricap;
        double cevre= 2*Math.PI*yaricap;

        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);


    }
}
