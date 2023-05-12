package DSA;

public class Search_In_Range {

    public static void main(String[] args) {
        int[] arr={3,4,9,54,6,3,7,65,70};
        int target=54;
        System.out.println(linearSearch(arr,target,2,6));}
        static int linearSearch(int[] arr,int target,int start,int end){
            if (arr.length==0){
                return -1;
            }
//      run a for loop
            for (int index=start; index<end; index++) {
                int element = arr[index];
                if (element == target) {
                    return index;
                }
            }
//            this line will execute if none of the return statements above has executed
            return -1;
        }
    }

