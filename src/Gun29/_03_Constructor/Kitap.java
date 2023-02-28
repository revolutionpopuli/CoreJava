package Gun29._03_Constructor;

public class Kitap {
    String name;
    int publishyear;
    String author;

    public Kitap(String name) {
        this.name = name;
    }

    public Kitap(String name, int publishyear) {
        this.name = name;
        this.publishyear = publishyear;
    }

    public Kitap(String name, int publishyear, String author) {
        this.name = name;
        this.publishyear = publishyear;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "name='" + name + '\'' +
                ", publishyear=" + publishyear +
                ", author='" + author + '\'' +
                '}';
    }
}
