package DSA;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={3,5,2,8,7,34,25};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            int index=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[i]){
                    index=j;
                }
            }
            int smallest=arr[index];
            arr[index]=arr[i];
            arr[i]=smallest;
        }
    }
}
