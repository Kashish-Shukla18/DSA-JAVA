package DSA;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7, 9, 54, 66, 98,};
        int target = 54;
        System.out.println(Search(arr, target));
    }

    static int Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
//            int mid=start+(end-start)/2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

}
