package Gun22;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        //dizi, array:Boyut sayısı belli ve sonradan boyutu değiştirilemez.
        int[] dizi=new int[5];//Array 5 elemanlı boyutu sonradan değiştirilemiyor.

        //Boyutu dinamik olsa, eleman eklendikçe uzasa, sildikçe kısalsa.
        //ArrayList:Boyutu başta vermene gerek yok,boyut 0 (sıfır) başta.
        //Eleman eklendikçe artar, sildikçe azalır.

        ArrayList<Integer>integerList=new ArrayList<>();//tanımlama
        ArrayList<Boolean>booleanList=new ArrayList<>();
        ArrayList<String>stringList=new ArrayList<>();

         //int s1=5;//hafızada sadece sayı saklayabilen bir değişken. İlkel tip, primitive tip, default değeri:0
        //Integer s2=6;//içinde hem sayı hem de fonksiyonlar saklıyor, default değeri: null

        ArrayList<String>isimler=new ArrayList<>();
        System.out.println("isimler = " + isimler);

        isimler.add("Ahmet");//uzunluğu 1
        isimler.add("Ayşe");//uzunluğu2
        isimler.add("Kaya");
        isimler.add("Ali");//hep sonuna geliyor

        System.out.println("isimler = " + isimler);
        System.out.println("isimler.size() = " + isimler.size());

        isimler.add(1,"Fatih");//verilen indexe ekliyor
        System.out.println("isimler = " + isimler);
        
        isimler.set(1,"Zeynep");//belli bir indexteki elemanı değiştirme
        System.out.println("set = " + isimler);
        
        isimler.remove("Zeynep");//elemanı bulup siliyor
        System.out.println("remove = " + isimler);

        isimler.remove(0);//0 indexteki elemanı sil
        System.out.println("remove = " + isimler);

        int indexOf=isimler.indexOf("Kaya");//verilen elemanın indexini verir
        System.out.println("indexOf = " + indexOf);

        for (int i = 0; i < isimler.size(); i++) {
            if(isimler.get(i).equalsIgnoreCase("kaya"))
                isimler.remove(i);

            System.out.println("isimler = " + isimler);

            String ilkEleman=isimler.get(0);//indexteki elemanı alma sayı=dizi[0]

            isimler.clear();;
            System.out.println("clear = " + isimler);
        }





    }
}
