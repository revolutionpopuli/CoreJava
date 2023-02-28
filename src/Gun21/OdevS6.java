package Gun21;

public class OdevS6 {
    public static void main(String[] args) {

        //EvenOddNums isminde bir method oluşturun. Bu yöntem String olan bir parametreyi kabul etsin.
        //Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
        //Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın. Toplam sonucu
        //yazdırın.
        //**İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.
        // Örnek: String = "6678421312" //6+6-7+8+4+2-1-3-1+2 //sonuç= 16 olmalı

        String sayilar="6678421312";
        System.out.println(evenOddNums(sayilar));



    }

    public static String evenOddNums(String sayilar){

        int toplam=0;
        long basamak=0;
        long sayi=Long.parseLong(sayilar);

        for (int i = 0; i < sayilar.length(); i++) {
            basamak=sayi%10;
            sayi/=10;

            if(basamak%2==0)
                toplam+=basamak;
            else{
                toplam-=basamak;
            }


        }
String strToplam=String.valueOf(toplam);
return strToplam;
    }

}
