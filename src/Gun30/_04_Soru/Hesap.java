package Gun30._04_Soru;

public class Hesap {

    int yatan=0;//buradaki değişkenler için "this" kullanacağız
    int cekilen=0;//
    private int bakiye=0;//


    void paraYatir(int yatirilanPara) {
      this.yatan=this.yatan+yatirilanPara;
      this.bakiye=this.bakiye+yatirilanPara;

    }

    void paraCek(int cekilenPara) {
       this.cekilen=this.cekilen+cekilenPara;
       this.bakiye=this.bakiye-cekilenPara;
    }

    @Override
    public String toString() {
        return "Hesap{" +
                "yatan=" + yatan +
                ", cekilen=" + cekilen +
                ", bakiye=" + bakiye +
                '}';
    }
}

