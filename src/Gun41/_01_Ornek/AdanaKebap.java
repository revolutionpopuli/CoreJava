package Gun41._01_Ornek;

public class AdanaKebap implements IFood {

    @Override
    public void taste() {
        System.out.println("Etin en güzel hallerinden biri");
    }

    @Override
    public double ucret() {
        return 50;
    }
    void marinade(){
        System.out.println("Et dünden özel baharatlarla marine edildi");
    }
    void grill(){
        System.out.println("Kömür ateşinde yavaş pişirildi");
    }
}
