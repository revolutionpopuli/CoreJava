package Gun04;

public class _05_Ornek3 {
    public static void main(String[] args) {
        // Kişinin ağırlığını double, boyunu int olarak değerler veriniz.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazdırınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)

        double kilo=89.5;
        int boy=174;

        double kitleIndex= kilo/ (boy*boy); // widening
        System.out.println("kitleIndex = " + kitleIndex);
        System.out.println("boyunuz="+boy+",kilonuz"+kilo);

        /*******************/

int kitleIndex2= (int)kilo/(boy*boy); //veri kaybı oluştu, narrow daraltma yönünde
        System.out.println("kitleIndex2 = " + kitleIndex2);





    }
}
