package Gun04;

public class _07_Ornek {
    public static void main(String[] args) {
        // String olarak verilen 2 adet bağış parasının toplamını yazıdırnız.

        String bagis1="500";
        String bagis2="1500";
        //int toplamBagis=bagis1+bagis2; string oldukları toplanamaz

        System.out.println(bagis1 + bagis2); //yan yana yazar, 2 ayrı kelime gibi düşündü

        int intBagis1= Integer.parseInt(bagis1);
        int inBagis2= Integer.parseInt(bagis2);

        int toplamBagis= intBagis1+inBagis2;

        System.out.println("toplamBagis = " + toplamBagis);




    }
}
