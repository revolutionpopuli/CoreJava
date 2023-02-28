package Gun29._01_Constructor;

public class Okul {

    public static void main(String[] args) {

        //1. Yöntem

        Student ogr1=new Student();
        ogr1.id=1;
        ogr1.name="ismet";
        ogr1.surname="temur";
        ogr1.classroom=11;
        System.out.println("ogr1 = " + ogr1.name);

        //2. Yöntem
        Student ogr2=new Student(1,"mehmet", "yılmaz", 11);
        System.out.println("ogr2 = " + ogr2.name);

        Student ogr3=new Student(3, "hatice", "demir");

        Student ogr4=new Student(4,"Ali");




    }




}
