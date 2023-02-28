package Gun38._01_Ornek;

public class ToyotaPrius extends Vehicle implements IGas, IElectric{

    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "ömür boyu kullan";
    }

    @Override
    public String changeOil() {
        return "bir depo ile 300 km gider";
    }

    @Override
    public String drive() {
        return "ilk 3 km elektrikle gider";
    }
}
