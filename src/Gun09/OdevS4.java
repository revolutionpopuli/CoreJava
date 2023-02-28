package Gun09;

import java.util.Scanner;

public class OdevS4 {
    public static void main(String[] args) {
        //Girilen bir kelimede A harfinin olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Kelime Girin=");
        String kelime= oku.next();

        boolean varMi=kelime.contains("A");
        System.out.println("A harfi var mı = " + varMi);





    }
}
