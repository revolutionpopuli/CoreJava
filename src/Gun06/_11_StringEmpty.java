package Gun06;

public class _11_StringEmpty {
    public static void main(String[] args) {
        
        //Bir stringin içinde bir şey var mı yok mu boolen olarak verir
        
        String s1="merhaba";
        System.out.println("s1.isEmpty() = " + s1.isEmpty());//false
        
        String s2=" "; //boşluk karakteri A gibi bir karakterdir.
        System.out.println("s2.isEmpty() = " + s2.isEmpty());//false
        
        String s3="";
        System.out.println("s3.isEmpty() = " + s3.isEmpty());//true
    }
}
