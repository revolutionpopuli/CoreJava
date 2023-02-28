package Gun17;

public class _01_JavaArray {
    public static void main(String[] args) {
        // 50 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan Random atayarak
        // doldurunuz. Sonrasında ayrı bir döngü ile tek olanlara 1, çift olanlara 2 atayınız  yazdırınız.

        int[] dizi=new int[50]; // 50 elemanlı bir dizi tanımlayınız

        for (int i=0; i< dizi.length; i++)// 0-49 dahil arası
            dizi[i]=(int) (Math.random()*10); // 10 a kadar olan sayılardan Random atayarak doldurunuz

        for(int i=0; i< dizi.length; i++) // Kontrol için yazdırdık.
            System.out.println(i+".kutu = " + dizi[i]);

        for(int i=0; i< dizi.length; i++) //Sonrasında ayrı bir döngü
        {
            if (dizi[i]%2==1)
                dizi[i]=1; // Tek olanlar
            else
                dizi[i]=2; // Çift olanlar
        }
        System.out.println("**************");
        for(int i=0; i< dizi.length;i++)
            System.out.println(i+".sayı = " + dizi[i]);
    }
}
