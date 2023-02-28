package Gun40._02_Ornek;

public class ABmain {
    public static void main(String[] args) {

        A a =new A();
        System.out.println("A.mesaj = " + A.mesaj);

        B b=new B();//burada değiştirildi
        System.out.println("B.mesaj = " + B.mesaj);

        A a2=new A();
        System.out.println("A.mesaj = " + A.mesaj);
    }
}

//soru:static biliyor musun

