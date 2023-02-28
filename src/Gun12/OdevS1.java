package Gun12;

import java.util.Scanner;

public class OdevS1 {
    public static void main(String[] args) {
        //1- Girilen bir ay numarasına göre , ayın hem adını hem de kaç gün olduğunu sayı ile yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Ay Numarası Giriniz=");
        int ay= oku.nextInt();

        switch (ay) {

            case 1: System.out.println("Ocak, 31 gün");break;
            case 2: System.out.println("şubat, 28 gün");break;
            case 3: System.out.println("Mart, 31 gün");break;
            case 4: System.out.println("Nisan, 30 gün");break;
            case 5: System.out.println("Mayıs, 31 gün");break;
            case 6: System.out.println("Haziran, 30 gün");break;
            case 7: System.out.println("Temmuz, 31 gün");break;
            case 8: System.out.println("Ağustos, 31 gün");break;
            case 9: System.out.println("Eylül, 30 gün");break;
            case 10: System.out.println("Ekim, 31 gün");break;
            case 11: System.out.println("Kasım, 30 gün");break;
            case 12: System.out.println("Ocak, 31 gün");break;
            default:
                System.out.println("HatalI Giriş");




        }




    }
}
