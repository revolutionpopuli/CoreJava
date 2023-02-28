package Gun21;

import java.util.Scanner;

public class OdevS1 {
    public static void main(String[] args) {
        //Ismi **randomNum** olan bir method oluşturun.
        //Parametre olarak **int max** almalı.
        //Bu method, 0 ile max arasında random bir değer döndürmelidir.
        //Random numarayı döndürünüz.

     int random=randomNum(100);
        System.out.println("random = " + random);

    }
public static int randomNum(int max){
       int randomNum=(int)(Math.random()*max);
       
       return randomNum;
        
}

}
