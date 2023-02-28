package Gun21;

import java.util.Arrays;
import java.util.Scanner;

public class OdevS4 {
    public static void main(String[] args) {
        //Adı  reverseWord olan bir method oluşturun
        //Bu methodun String olarak bir parametresi olmalıdır
        //Ve bu cümledeki kelimelerle tersine çevirmeli
        //Ters halini yazdırın.
        //Örnek 1 :
        //Dize: Java yazın
        //dönüş şöyle olmalıdır:  yazın Java
        //Örnek 2:
        //Dize: Sakin olun ve evde kalın
        //dönüş olmalı: kalın evde ve olun sakin


        Scanner oku = new Scanner(System.in);
        System.out.print("Cümle=");
        String text = oku.nextLine();

        System.out.println(reverseWord(text));


    }

    public static String reverseWord(String text) {
        String[] str = text.split(" ");
        String[] reverseText = new String[str.length];
        int index = 0;
        for (int i = str.length - 1; i >= 0; i--) {
            reverseText[index] = str[i];
            index++;
        }

        String newReverseText = " ";
        for (int i = 0; i < reverseText.length; i++) {
            newReverseText += reverseText[i] + " ";


        }
        return newReverseText;
    }
}