package Gun16;

public class OdevS1 {
    public static void main(String[] args) {
        //String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        //Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        //Eğer aitse "true" çevirin.

        String[] meyveler={"Apple","Orange","Banana","Pineapple"};

        for(int i=0; i< meyveler.length;i++)
            if("Apple"==meyveler[i])
                System.out.println("true");




    }
}
