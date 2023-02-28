package Gun35._02_Ornek;

public class Daire extends Sekil {

    private int yariCap;

    public Daire(int yariCap) {
        setYariCap(yariCap);
    }

    @Override
    public double alan() {
        return 2*Math.PI*yariCap;
    }

    @Override
    public double cevre() {
        return Math.PI*yariCap*yariCap;
    }

    public int getYariCap(int yariCap) {
        return this.yariCap;
    }

    public void setYariCap(int yariCap) {
        this.yariCap = yariCap;
    }
}
