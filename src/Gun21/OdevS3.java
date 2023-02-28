package Gun21;

import java.util.Scanner;

public class OdevS3 {
    public static void main(String[] args) {
        //reverseString isminde bir method oluşturun.
        //Bu method bir String'i parametre olarak alsın.
        //Ve bu method, girilen String'i tersten yazsın.
        //Terste yazılmış halini yazdırınız.
        //Örn: String = "Java'yı Seviyorum."
        //Print: .muroyiveS ıy'avaJ

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir cümle giriniz=");
        String cumle = oku.nextLine();

        System.out.print("Tersi="+reverseString(cumle));

    }

    public static String reverseString(String cumle) {
    String reverse="";
        for (int i = cumle.length()-1; i >=0 ; i--) {

            reverse=reverse+cumle.charAt(i);

            
        }
        return reverse;
    }

}
