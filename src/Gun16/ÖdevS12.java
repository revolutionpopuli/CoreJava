package Gun16;

import java.util.Arrays;
import java.util.Scanner;

public class ÖdevS12 {
    public static void main(String[] args) {
        //- Kullanıcıdan alacağınız 5 ayrı kelimeyi bir diziye atayınız,
        ///Kelimelerden en uzun olanının ilk ve son harfininin yerlerini değiştiriniz.


        String[] kelime={"kalem", "kitap", "kitaplık", "masa", "sandalye"};

        int enUzunKelime=0;
        int maxKelimeSayisi=0;
        for (int i = 0; i <5; i++) {
            if(kelime[i].length()>maxKelimeSayisi)
                    enUzunKelime=i;
                    maxKelimeSayisi=kelime[i].length();

        }
        System.out.println("enUzunKelime = " + kelime[enUzunKelime]);

        }

}
