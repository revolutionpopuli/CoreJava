package Gun06;

public class _08_StringContains {
    public static void main(String[] args) {
        // contains: bir stringin içerisinde karakter(ler)in var olup olmadığını boolean cinsinden söyler, true veya false

        String cumle="Merhaba Dünya";
        boolean varMi=cumle.contains("a");
        System.out.println("varMi = " + varMi);

        //direkt de yapabiliriz. 2. yöntem
        System.out.println("varMi 2="+cumle.contains("a"));

        System.out.println("cumle.contains(ya)="+ cumle.contains("ya"));
        System.out.println("cumle.contains(k) = " + cumle.contains("k"));
        System.out.println("cumle.contains (Dünya = " + cumle.contains("Dünya"));
        System.out.println("cumle.contains(dünya) = " + cumle.contains("dünya"));



    }
}
