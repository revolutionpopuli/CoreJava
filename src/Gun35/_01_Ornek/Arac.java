package Gun35._01_Ornek;

public class Arac {
    private String renk;
    private String marka;
    private int motorHacmi;


    public Arac(String renk, String marka, int motorHacmi) {
        setRenk(renk);
        setMarka(marka);
        setMotorHacmi(motorHacmi);
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(int motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "renk='" + renk + '\'' +
                ", marka='" + marka + '\'' +
                ", motorHacmi=" + motorHacmi +
                '}';
    }
}


