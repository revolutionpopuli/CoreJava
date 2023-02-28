package Gun13;

import java.util.Scanner;

public class OdevS2 {
    public static void main(String[] args) {
        //0-100 arasındaki sayılardan teklerin ayrı, çiftlerin ayrı toplamını bulunuz

        int sayac=0;
        int ciftToplam=0;
        int tekToplam=0;

        while (sayac<100) {

            if (sayac%2==0) ciftToplam=ciftToplam+sayac;
            else  tekToplam=tekToplam+sayac;
            sayac++;
            }
        System.out.println("tekToplam = " + tekToplam);
        System.out.println("ciftToplam = " + ciftToplam);






    }
}
