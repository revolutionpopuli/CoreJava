package Gun44._01_ZamanDigerIslemler;

import java.time.LocalDate;

public class _01_ComparingDateAndTime {
    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        LocalDate dun=bugun.minusDays(1);

        boolean sonraMi=bugun.isAfter(dun);
        System.out.println("sonraMi = " + sonraMi);

        boolean onceMi=bugun.isBefore(dun);
        System.out.println("onceMi = " + onceMi);

        boolean esitMi=bugun.isEqual(dun);
        System.out.println("esitMi = " + esitMi);
        
        boolean artikYilMi=bugun.isLeapYear();
        System.out.println("artikYilMi = " + artikYilMi);



    }
}
