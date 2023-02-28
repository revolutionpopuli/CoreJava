package Gun41._01_Ornek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args)  {

        Scanner oku=new Scanner(System.in);
        List<IFood> siparisler=new ArrayList<>();


        int secim=0;


        do {
            menu();
            secim = oku.nextInt();
            switch (secim){

                case 1:
                    //IFood da olur
                    AdanaKebap ak=new AdanaKebap();
                    siparisler.add(ak);
                    break;
                case 2: Lahmacun l=new Lahmacun();
                    siparisler.add(l);
                    break;
                case 3: Borsh b=new Borsh();
                    siparisler.add(b);
                    break;

                case 4:Palov p=new Palov();
                siparisler.add(p);
                break;

            }

        }while(secim<5);

        System.out.println("Alınan Siparişler");
        for (IFood f:siparisler) {

            System.out.println(f.getClass().getSimpleName());
        }

        System.out.println("Siparişler Hazırlanıyor");
        double toplamUcret=0;
        for (IFood f:siparisler) {

            TechnoKitchen.hazirla(f);
            toplamUcret+=f.ucret();
        }
        System.out.println("toplamUcret = " + toplamUcret);

    }

    public static void menu () {
        System.out.println("*****MENU******");
        System.out.println("1-Adana Kebap(50 TL)");
        System.out.println("2-Lahmacun (30 TL)");
        System.out.println("3-Borsh (30 TL)");
        System.out.println("4-Palov(20 TL)");
        System.out.println("5-Tamam");
        System.out.print("Seçiminiz=");


    }
}
