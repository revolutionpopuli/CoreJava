package Gun39._02_Ornek;

import Utility.MyFunc;

public abstract class Sekil {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double alan();
    public abstract double cevre();

    public void ciz(){
        System.out.println(this.name+" isimli şekil çizildi");
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name + '\'' +" Alan="+ MyFunc.yuvarla(alan())+" Çevre="+MyFunc.yuvarla(cevre())+
                '}';
    }
}
