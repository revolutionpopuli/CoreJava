package Gun31._02_FinalModifier.Ornek1;

public class Student {
   private final int okulNo;
    String tamAdi;
    private static int sayac=1;

    public Student(String tamAdi) {
        this.okulNo=sayac++;
        this.tamAdi = tamAdi;
    }

    @Override
    public String toString() {

        //okulNo=2;// private olsa da burada değiştirebilirsin
        return "Student{" +
                "okulNo=" + okulNo +
                ", tamAdi='" + tamAdi + '\'' +
                '}';
    }
}
