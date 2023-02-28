package Gun15;

public class _03_JavaNestedLoop {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *        1.Satırda 1 yıldız
        // **       2.satırda 2 yıldız
        // ***      3.satırda 3 yıldız
        // ****     4.satırda 4 yıldız
        // *****    5.satırda 5 yıldız



        for (int i=0; i<=5; i++)//kaç satır (satır)

        {
            for (int j=0; j<i; j++) //kaç karakter (sütun) //satır değeri kadar yaz(i)
                //sınırı satıra bağladık yani üstteki for a
                System.out.print("*");

            System.out.println();//her satırdan sonra \n

        }





    }
}
