package Gun05;

import java.util.Scanner;

public class _08_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan ağırlığını double, boyunu int olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazdırınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)

        Scanner oku=new Scanner(System.in);
        System.out.print("kilonuz=");
        double kilo= oku.nextDouble();
        System.out.print("boyunuz=");
        int boy= oku.nextInt();

        double index=kilo/(boy*boy);

        System.out.println("index = " + index);

        System.out.println("Boyunuz="+boy+",kilonuz="+kilo);
        System.out.println("index="+ index);






    }
}
