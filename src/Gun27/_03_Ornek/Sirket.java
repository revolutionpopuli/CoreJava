package Gun27._03_Ornek;

public class Sirket {
    public static void main(String[] args) {
        // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
        // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
        // 3- Adım : Bu degerlerı yazdırınız.
        // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
        //           çalıştığında kişinin doğum yılını versin.
        // 5- Adım : getInitials isminde kişinin adının ilk harfi.soyadının ilk harfi
        //           şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.


        Person personel1 = new Person();
        personel1.name = "Rıza";
        personel1.surname = "Yılmaz";
        personel1.age = 30;

        Person personel2 = new Person();
        personel2.name = "Ali";
        personel2.surname = "Han";
        personel2.age = 23;

        //1. Yöntem
        System.out.println("personel1 = " + personel1.name);
        System.out.println("personel1 = " + personel1.surname);
        System.out.println("personel1 = " + personel1.age);

        System.out.println("personel2 = " + personel2.name);
        System.out.println("personel2 = " + personel2.surname);
        System.out.println("personel2 = " + personel2.age);

        //2. Yöntem
        bilgiYazdir(personel1);
        bilgiYazdir(personel2);

        //3.Yöntem-En iyi Yöntem, ilgili metodu kendi classına at
        personel1.bilgiYazdir();
        personel2.bilgiYazdir();

        personel1.getBirthYear();
        personel2.getBirthYear();

        System.out.println("personel1 = " + personel1.getBirthYear());
        System.out.println("personel2 = " + personel2.getBirthYear());

        System.out.println("personel1 = " + personel1.getInitials());
        System.out.println("personel2= " + personel2.getInitials());


    }

    public static void bilgiYazdir(Person p) {

        System.out.println("personel = " + p.name);
        System.out.println("personel = " + p.surname);
        System.out.println("personel = " + p.age);
    }
}
