package Gun08;

public class _06_JavaComparisonOperators {
    public static void main(String[] args) {

        int a=50;
        int b=50;
        //= atama, == eşit mi

        System.out.println("a b ye eşit mi?"+(a==b));//true
        System.out.println("a b den farklı mı?"+(a!=b));//false

        System.out.println("a b den büyük mü?"+(a>b));
        System.out.println("a b den küçük mü?"+ (a<b));

        System.out.println("a b den büyük eşit mi?"+(a>=b));
        System.out.println("a b den küçük eşit mi?"+(a<=b));

    }
}