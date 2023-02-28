package Gun28._01_Ornek;

public class UtilityMain {

    public static void main(String[] args) {

        myUtility myUt=new myUtility();
        String strSayi=myUt.getString(356);
        int sayi3=myUt.getInt("345");
        //bu metodlar Class a değil Nesneye ait


        String strSayi2=myUtility.getString2(23);
        int sayi2=myUtility.getInt2("34");
        //bu metodlar nesne oluşturmaya ihtiyaç duymayan
        //class a ait metodlardır.
        //tipe ait olduğu için adıyla çağrılabilir.("new" e gerek yok)
        Integer.parseInt("34"); //bu metod tipe ait

        //Nesneyi ilgilendiren metodları normal yazıyoruz
        //Nesneyi ilgilendirmeyen, tipi ilgilendiren metodları
        //STATIC ile yazıyoruz

    }

}
