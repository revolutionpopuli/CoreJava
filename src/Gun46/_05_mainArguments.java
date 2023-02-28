package Gun46;

public class _05_mainArguments {
    public static void main(String[] args) {
        //program çalışmadan önce parametre olarak verilen sayıları toplayan programı yazınız

        int toplam=0;
        for (String s:args){
            System.out.println("s = " + s);
            toplam=toplam+Integer.parseInt(s);
        }
        System.out.println("toplam = " + toplam);
    }
}
