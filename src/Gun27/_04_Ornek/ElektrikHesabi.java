package Gun27._04_Ornek;

public class ElektrikHesabi {
 int toplamTuketim=0;
 double birimFiyat=0.7;
 double fatura=0;

 void tuketimEkle(int gelenTuketim){
  toplamTuketim=toplamTuketim+gelenTuketim;

 }

 void faturaYaz(String musteriAdi){

  double toplamTutar=toplamTuketim*birimFiyat;
  System.out.println("*******************");
  System.out.println("Müsteri Adi = " + musteriAdi);
  System.out.println("Toplam Tuketim = " + toplamTuketim);
  System.out.println("Toplam Tutar = " + Math.round(toplamTutar));

 }

 void toplamTuketimYaz(){

  System.out.println("toplamTuketim = " + toplamTuketim);
 }

}
