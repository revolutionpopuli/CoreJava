package Gun39._02_Ornek;

public class Dikdortgen extends Sekil{
    private int kisaKenar;
    private int uzunkenar;

    public Dikdortgen(int kisaKenar, int uzunkenar) {
        setKisaKenar(kisaKenar);
        setUzunkenar(uzunkenar);
    }

    @Override
    public double alan() {
        return this.uzunkenar*this.kisaKenar;
    }

    @Override
    public double cevre() {
        return (this.uzunkenar+this.kisaKenar)*2;
    }

    public int getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(int kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public int getUzunkenar() {
        return uzunkenar;
    }

    public void setUzunkenar(int uzunkenar) {
        this.uzunkenar = uzunkenar;
    }
}
