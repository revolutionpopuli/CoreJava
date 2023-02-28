package Gun19;

public class _06_Java2DArrays {
    public static void main(String[] args) {
        int [][] tablo={ //5 satır
                {4,55}, // 0. satır
                {45,6,77}, // 1. satır
                {4,2,999,45,56,66}, // 2. satır
                {4,20,16,10}, // 3. satır
                {41}, // 4. satır
        };

        System.out.println("Satır Miktarı="+tablo.length);
        System.out.println("0.Satırdaki Sütun Miktarı="+tablo[0].length);
        System.out.println("1.Satırdaki Sütun Miktarı="+tablo[1].length);
        System.out.println("2.Satırdaki Sütun Miktarı="+tablo[2].length);
        System.out.println("3.Satırdaki Sütun Miktarı="+tablo[3].length);
        System.out.println("4.Satırdaki Sütun Miktarı="+tablo[4].length);

        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j]+"\t");

            }
            System.out.println();
        }



    }
}
