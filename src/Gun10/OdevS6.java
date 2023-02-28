package Gun10;

import java.util.Scanner;

public class OdevS6 {
    public static void main(String[] args) {
        //Girilen bir string
        //Eğer String € karakterini kapsıyorsa "This is euro" yazdırın.
        //Eğer String $ karakterini kapsıyorsa "This is dollar" yazdırın.
        //Aksi halde (else) "no money" yazdırın.

        Scanner oku=new Scanner(System.in);
        System.out.print("Kelime Giriniz=");
        String kelime= oku.next();

        if (kelime.contains("€")) {
            System.out.println("This is euro");
        }

        if (kelime.contains("$")) {
            System.out.println("This is dollar");
        }

        else System.out.println("no money");


    }
}
