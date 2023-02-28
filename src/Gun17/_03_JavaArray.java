package Gun17;

public class _03_JavaArray {
    public static void main(String[] args) {
        // 100 Elemanlı bir diziyi random olarak 100 e kadar olan sayılarla doldurunuz.
        // Sonrasında tek ve çift eleman sayılarını bulunuz.

        int[] dizi=new int[100];

        for(int i=0; i< dizi.length; i++)
            dizi[i]=(int) (Math.random()*100);

        for(int i=0; i< dizi.length; i++)
            System.out.println(i+".kutu = " + dizi[i]);

        int tekAdet=0;
        int ciftAdet=0;
        for(int i=0; i< dizi.length; i++) {
            if (dizi[i]%2==0)

                ciftAdet++;
            else

                tekAdet++;

        }


        System.out.println("ciftAdet = " + ciftAdet);
        System.out.println("tekAdet = " + tekAdet);

    }
}
