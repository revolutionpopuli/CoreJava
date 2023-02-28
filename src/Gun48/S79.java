package Gun48;

public class S79 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
            if (arr[i].equals("D")) {
                System.out.println("Work done");
                break;
            }

            continue;//Döngünün benden sonrasını pas geç demek. Zaten sonrasında bir şey yok, etkisiz eleman.
        }
    }

    }

