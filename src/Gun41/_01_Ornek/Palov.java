package Gun41._01_Ornek;

public class Palov implements IFood {

    @Override
    public void taste() {
        System.out.println("Çocukların vazgeçilmezi");
    }

    @Override
    public double ucret() {
        return 20;
    }
    void fry(){
        System.out.println("Pirinç ve şehriye kavruldu");

    }
    void boil(){
        System.out.println("Kısık ateşte pişirildi");
    }

}
