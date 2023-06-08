package DSA;

public class FibonacciSeries {
    public static void main(String[] args) {
        for (int i=0;i<11;i++){
            System.out.println(fibonacci(i));
        }
    }
    static int fibonacci(int n){
        return (int) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
//          if (n<2){
//            return n;
//        }
//        return fibonacci(n-1)+fibonacci(n-2);
    }
 }
