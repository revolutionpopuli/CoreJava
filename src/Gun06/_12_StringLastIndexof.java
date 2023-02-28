package Gun06;

public class _12_StringLastIndexof {
    public static void main(String[] args) {
        // index gibi çalışır. bu aramaya baştan başlar
        //lastIndexof ise aramaya sondan başlar.

        String s1="Merhaba";
        System.out.println("Baştan sona doğru a yı verir = " + s1.indexOf("a"));//4
        System.out.println("Sondan başa doğru a yı arar = " + s1.lastIndexOf("a"));//6
        //index her zaman tek, sadece arama yönü değişir.



    }
}
