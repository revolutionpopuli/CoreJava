package Gun40._01_Ornek;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        
        Hayvan h1=new Kedi("köpük", false, "01/01/2020");
        System.out.println("h1 = " + h1);

        Kedi k1=new Kedi("köpük", false, "01/01/2020");
        System.out.println("k1 = " + k1);


        Hayvan kr=new Kartal("Kaya", true,"05/05/2000");
        System.out.println("kr = " + kr);
    }
}
