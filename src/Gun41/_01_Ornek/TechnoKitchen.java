package Gun41._01_Ornek;

import Utility.MyFunc;

public class TechnoKitchen {
    public static void hazirla(IFood food) {

        MyFunc.bekle(2);
        if(food instanceof AdanaKebap){
            ((AdanaKebap)food).marinade();
            MyFunc.bekle(1);
            ((AdanaKebap)food).grill();
            MyFunc.bekle(1);
            ((AdanaKebap)food).taste();
        }
        else if(food instanceof Lahmacun){
            MyFunc.bekle(1);
            ((Lahmacun)food).dough();
            MyFunc.bekle(1);
            ((Lahmacun)food).addMeat();
            MyFunc.bekle(1);
            ((Lahmacun)food).bake();
            MyFunc.bekle(1);
            ((Lahmacun)food).taste();

        } else if (food instanceof Borsh) {
            MyFunc.bekle(1);
            ((Borsh)food).boil();
            MyFunc.bekle(1);
            ((Borsh)food).eatTomorrow();
            MyFunc.bekle(1);
            ((Borsh)food).taste();


        } else if (food instanceof Palov) {
            MyFunc.bekle(1);
            ((Palov)food).boil();
            MyFunc.bekle(1);
            ((Palov)food).fry();
            MyFunc.bekle(1);
            ((Palov)food).taste();


        }


    }

}
