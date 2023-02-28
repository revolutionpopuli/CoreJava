package Gun15;

public class OdevS5 {
    public static void main(String[] args) {
        //Aşağıdaki çıktıyı veren programı yazınız
        //     **********
        //      ********
        //       ******
        //        ****
        //         **

        for (int i =0; i<5; i++) {

            for (int j = 0; j < i; j++)
                System.out.print(" ");

            for (int k = 10; k >0+(i*2); k--)
                System.out.print("*");

            System.out.println();
        }

    }


}
