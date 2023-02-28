package Gun38._01_Ornek;

import java.util.ArrayList;
import java.util.Arrays;

public class FabrikaMain {
    public static void main(String[] args) {
        TeslaCar tesla=new TeslaCar("model 5", 310);
        ToyotaPrius toyota=new ToyotaPrius("prius", 1200);
        Bus bus=new Bus("ıveco", 700);

        ArrayList<Vehicle>araclar=new ArrayList<>();
        araclar.add(tesla);
        araclar.add(toyota);
        araclar.add(bus);

        for (Vehicle v: araclar) {

            System.out.println(v.getClass().getSimpleName());
            System.out.println("v.getModel() = " + v.getModel());
            System.out.println("v.getEngine() = " + v.getEngine());

            if(v instanceof TeslaCar){

                System.out.println( ((TeslaCar)v).changeBattery());
                System.out.println( ((TeslaCar)v).drive());

            }
            if(v instanceof ToyotaPrius){

                System.out.println( ((ToyotaPrius)v).changeBattery());
                System.out.println( ((ToyotaPrius)v).drive());
                System.out.println( ((ToyotaPrius)v).changeOil());
            }
            if(v instanceof Bus){

                System.out.println( ((Bus)v).changeDiesel());
                System.out.println( ((Bus)v).drive());

            }


        }
        
    }
}
