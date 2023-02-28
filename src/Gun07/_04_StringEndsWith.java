package Gun07;

public class _04_StringEndsWith {
    public static void main(String[] args) {
        //Endswith: Verilen karakter(ler) ile bitiyor mu?
        //sonuç true ya da false yani boolean döner.

        String text="Merhaba Dünya";

        System.out.println("ya ile bitiyor mu="+ text.endsWith("ya"));//true
        System.out.println("a ile bitiyor mu="+ text.endsWith("a"));//true
        System.out.println("A ile bitiyor mu="+ text.endsWith("A"));//false
        System.out.println("n ile bitiyor mu="+ text.endsWith("n"));//false
        System.out.println("Dünya ile bitiyor mu="+ text.endsWith("Dünya"));//true
        System.out.println("dünya ile bitiyor mu="+ text.endsWith("dünya"));//false


    }
}
