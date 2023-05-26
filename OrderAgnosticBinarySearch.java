package DSA;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {2, 5, 6, 7, 9, 54, 66, 98}; // ascending order
        int[] arr = {100, 87, 80, 77, 65, 63, 10, 5, 1};  // descending order
        int target = 87;
        System.out.println(Search(arr, target));
    }

    static int Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
//        find whether the array is sorted in ascending or descending order

        while (start <= end) {
            int mid = (start + end) / 2;
//            int mid=start+(end-start)/2;
            boolean isAsc = arr[start] < arr[end];
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }

            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}