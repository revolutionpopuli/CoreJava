package Gun04;

public class _00_Giris {
    public static void main(String[] args) {


    byte ogrNot=90;
    int notToplam=ogrNot; // byte türünü int türüne atmış olduk. Widening casting, genişletilme

    ogrNot=(byte)notToplam; // int türünü byte türüne dönüştürüyorum.
    // bunu ancak veri kaybı oluşmuyorsa yani DEĞER atılacak tipe sığıyorsa yapabilirim.
    // bunu da bilerek yaptığını belirtmek için, dönüşecek tipin başına hedef tipin adı, parantez içine alınır.
    // buna da daraltma (narrow) yönünde dönüşüm (casting) denir.

    }
}
