package Gun34._01_Ornek;

public class YoneticiYeni extends Personel{

    private double yoneticitazminati;


    public void zamYap(){
        System.out.println("zam yapıldı");
    }

    public double getYoneticitazminati() {
        return yoneticitazminati;
    }

    public void setYoneticitazminati(double yoneticitazminati) {
        this.yoneticitazminati = yoneticitazminati;
    }
}
