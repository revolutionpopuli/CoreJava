package Gun29._01_Constructor;

public class Student {

    int id;
    String name;//this=> Class(tipin) ının kendisi.
    String surname;
    int classroom;

    Student() {//Constructor-Yapıcı Metodlar
        System.out.println("nesne oluşturuldu");
        //nesne oluşturulurken yapmak istediklerin için burayı kullan
    }

    Student(int id, String name, String surname, int classroom) {
        this.id = id;//this.id:class ın id si, id:local değişken parametre
        this.name = name;
        this.surname = surname;
        this.classroom = classroom;


    }

    Student(int id, String name, String surname) {

        this(id, name, surname, 0);
        //this.id = id;//this.id:class ın id si, id:local değişken parametre
        //this.name = name;
        //this.surname = surname;
        //this.classroom = 0;

    }
    Student(int id, String name){
        this(id, name,"",0);
    }
}