package Gun15;

public class GununSorusu {
    public static void main(String[] args) {

        //Aşağıdaki görüntüyü veren programı yazınız (yalnızca 1 yıldız ile yapınız)
        //    * 4 boşluk 1 yıldız
        //   ** 3 boşluk 2 yıldız
        //  ***
        // ****
        //*****

        for (int i = 1; i<=5; i++)
        {
            for (int j = 5; i<j; j--)
                System.out.print(" ");


            for (int k=0; k<i; k++)
                System.out.print("*");

            System.out.println();
        }





    }
}
