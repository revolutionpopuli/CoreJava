package Gun03;

public class _02_JavaDataTypes {
    public static void main(String[] args) {
        int sayi; // bütün tam sayılar kendi başlarınayken default INT görülür

        //Tam Sayılar
        byte byteDeger=7; // -128 127
        short shortDeger=1645;
        int intDeger=2500;
        long longDeger=23232223223L; // Default olarak tam sayıları INT kabul ettiğinden sonuna L koyaral LONG olduğunu belirttik.

        // ondalıklı sayılar
        // default olarak bütün ondalıklı sayıları DOUBLE kabul eder

        float floatDeger= 3.140005F; // ondalıklı sayılar default olarak DOUBLE gördüğünden sonuna F ekleyerek FLOAT olduğunu belirttik.

        double doubleDeger=3.14000000001;

        char basHarf='A'; // sayı olarak saklıyor karakter tablosuna bakarak, mesela A-> 65
        boolean evetMi=true; // sadece 2 değer alabilir true veya false

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("basHarf = " + basHarf);
        System.out.println("evetMi = " + evetMi);



    }

}
