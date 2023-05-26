package DSA;

public class EvenDigits {
    public static void main(String[] args){
        int[] nums = {12,345,2,62,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count=0;
for (int num:nums){
    if (even(num)){
        count++;
    }
}
return count;
    }
    static boolean even(int num){
        int NoOfDigits=digits(num);
        return NoOfDigits%2==0;
    }
    static int digits(int num){
        int count=0;
        if (num==0){
            return 1;
        }
        if (num<0){
            return num*-1;
        }
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}