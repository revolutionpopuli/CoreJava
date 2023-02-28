package Gun07;

public class _11_StringReplaceAll {
    public static void main(String[] args) {
        //ReplaceAll:replace gibi çalışır. farkı kriter (regex) verilebilir.
        //regex:regular expression/düzenli ifadeler
        //TODO (yapılacak): regex olarak neler yazılabiliyor google de araştırılacak
        
        String text="Merhaba Dünya123";
        System.out.println("text = " + text);//orjinal hali

        System.out.println("abn -> _ = " + text.replaceAll("[abn]","_"));//Merh___ Dü_y_123
        System.out.println("A-Z -> _ = " + text.replaceAll("[A-Z]", "_"));//_erhaba _ünya123
        System.out.println("0-9 -> _ = " + text.replaceAll("[0-9]","_"));//Merhaba Dünya___
        System.out.println("^0-9 dışındakiler-> _ = " + text.replaceAll("[^0-9]","_"));//123 ^sayıların DIŞINDAKİ



        

    }
}
