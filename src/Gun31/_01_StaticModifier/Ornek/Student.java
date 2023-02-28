package Gun31._01_StaticModifier.Ornek;

public class Student {

    int id;
    String fullName;
    static int sayac=1;
    //tüm nesnelere ait olan bilgileri veya
    //sayac gibi işlemler için static kullanılır

    public Student(String fullName) {
        this.id = sayac;
        this.fullName = fullName;
        sayac++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
