package Gun46;

import java.util.Scanner;

public class _02_ThrowExample2 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("yeni  şifre oluşturma");

        System.out.print("yeni şifrenizi oluşturunuz=");
        String password= oku.nextLine();

        try {
            if (password.length() < 8) {

                throw new Exception("Şifre 8 karakterden küçük olamaz");

            }

            if (password.length() > 15)

                throw new Exception("Şifre 15 karakterden büyük olamaz");


        }catch (Exception ex){
            //hatalar bir yere toplanıyor. Hepsi için yapılması gereken işlemler bir arada yapılabilir.Mesela log tutma gibi
            System.out.println("Lütfen Dikkat");
            System.out.println("Uyarı= "+ex.getMessage());
            //log tutma işlemi
        }


    }
}
