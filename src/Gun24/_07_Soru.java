package Gun24;

import java.util.Arrays;
import java.util.HashSet;

public class _07_Soru {
    public static void main(String[] args) {

        // Soru : 20 dan  60 kadar olan random sayılarla 10 elemanlı normal
        // bir diziyi doldurunuz. Sonrasında farklı olan rakamları , bir başka diziye
        // atayınız.(aynı rakamlar atılmayacak)
        // 2.Aşama - bir başka diziye atma işlemini bu sefer SET ile yapınız.

        int [] dizi=new int[10];

        for (int i = 0; i < dizi.length ; i++) {
            dizi[i]= (int) (Math.random()*(60-20))+20;

        }
        System.out.println(Arrays.toString(dizi));



    }
}
