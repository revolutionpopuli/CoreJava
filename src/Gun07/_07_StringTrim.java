package Gun07;

public class _07_StringTrim {
    public static void main(String[] args) {
        //trim: Stringin başında veya sonundaki boşlukları temizler.

       String text="  Merhaba Dünya  ";

        System.out.println("textin orjinal hali=->"+text+"<-");
        System.out.println("textin trmlenmiş hali= ->"+ text.trim()+"<-");

    }
}
