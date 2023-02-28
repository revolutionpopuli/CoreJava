package Gun15;

public class _01_JavaNestedLoop{
    public static void main(String[] args) {
        // 2 lerin çarpım tablosunu istemiştik
        // 2 x 1 =2
        // 2 x2 =4
        //........
        // Bunun hepsini istiyoruz 1-10

        for (int j=1;j<10; j++) {

        for (int i=1; i<=10; i++) {

            System.out.println(j+"x" + i + "=" + (j*i));
        }
            System.out.println();
        }





    }
}
