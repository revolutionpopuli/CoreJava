package Gun07;

public class _06_StringToUpperCase {
    public static void main(String[] args) {
        //ToUpperCase: stringi büyük hrfe çevirir.

        String text="Merhaba Dünya";

        System.out.println("orjinal hali="+text);
        System.out.println("textin büyük harf hali = " + text.toUpperCase());

        //büyük veya küçük farketmeksizin YA ile bitiyor mu?
        System.out.println("Sonuç="+ text.toUpperCase().endsWith("YA"));


    }
}
