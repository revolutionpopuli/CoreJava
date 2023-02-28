package Gun06;

import java.util.Scanner;

public class _13_Soru {
    public static void main(String[] args) {
        //Girilen bir string de boşluk karakteri olup olmadığını bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir String Giriniz=");
        String girilen= oku.nextLine();

        System.out.println("Boşluk karakteri var mı= " + girilen.contains(" "));



    }
}
