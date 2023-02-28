package Gun43;

import java.time.LocalDate;
import java.time.Period;

public class _02_Period {
    public static void main(String[] args) {
        //İki tarih arasındaki zaman farkını gösterir
        //LocalDate ler için kullanılır

        LocalDate dogumTarihi=LocalDate.of(1988, 3, 10);
        LocalDate bugun=LocalDate.now();

        Period fark=Period.between(dogumTarihi, bugun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        /************************************************/

        Period period3Gun=Period.ofDays(3);
        Period  period3Ay=Period.ofMonths(3);

        LocalDate ucGunSonra=bugun.plus(period3Gun);
        LocalDate ucAySonra=bugun.plus(period3Ay);

        System.out.println("ucGunSonra = " + ucGunSonra);
        System.out.println("ucAySonra = " + ucAySonra);
        
        /****************************************/
        //Kursun süresini ve bitiş gününü bulunuz (6 ay)
        
        LocalDate kBaslangic=LocalDate.of(2022,7,25);
        Period kursSuresi=Period.ofMonths(6);
        LocalDate kBitis=kBaslangic.plus(kursSuresi);
        System.out.println("kBitis = " + kBitis);
        System.out.println("kBitis.getDayOfWeek() = " + kBitis.getDayOfWeek());

        //Kursun bitmesine ne kadar süre kaldı.
        Period kalanSure=Period.between(bugun, kBitis);
        System.out.println("kalanSure = " + kalanSure);

        //Kurs ne kadar süredir devam ediyor
        Period devamSuresi=Period.between(kBaslangic, bugun);
        System.out.println("devamSuresi = " + devamSuresi);




        
        
    }
}
