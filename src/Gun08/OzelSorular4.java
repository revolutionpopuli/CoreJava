package Gun08;

import java.util.Scanner;

public class OzelSorular4 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("Vize notunuzu giriniz=");
        int vizenotu= oku.nextInt();
        System.out.print("Final notunuzu giriniz=");
        int finalnotu=oku.nextInt();

        double ortalama=vizenotu*0.4+finalnotu*0.6;
        System.out.println("ortalama = " + ortalama);




    }
}
