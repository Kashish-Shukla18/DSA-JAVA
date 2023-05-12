package DSA;
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        if (a >= b && a >= c) {
//            System.out.print(a);
//        } else if (b >= a && b >= c) {
//            System.out.print(b);
//        } else {
//            System.out.print(c);
//        }
        int as1=Math.max(a,b);
        int as2=Math.max(as1,c);
        System.out.print(as2);
    }
}
