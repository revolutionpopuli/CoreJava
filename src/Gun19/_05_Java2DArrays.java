package Gun19;

public class _05_Java2DArrays {
    public static void main(String[] args) {
        int [][] tablo={ //5 satır, 3 sütun ->5x3
                {4,55,66}, // 0. satır
                {45,6,77}, // 1. satır
                {4,2,999}, // 2. satır
                {4,20,16}, // 3. satır
                {41,25,76}, // 4. satır
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
