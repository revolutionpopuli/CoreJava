package Gun34._02_Ornek;

public class Kopek extends Hayvan{

    public Kopek(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);//super miras alınan class, base, parent
    }

    public void konustu(){
        //super.konustu();
        System.out.println("havladı");
    }
}
