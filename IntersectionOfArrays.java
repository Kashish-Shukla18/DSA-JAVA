package DSA;

import java.util.HashSet;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] arr1={10,15,20,15,30,30,5};
        int[] arr2={30,5,30,80};
        System.out.println(intersection(arr1,arr2,7,4));
    }
    static int intersection(int[] a,int[] b,int m,int n) {
        HashSet<Integer> s = new HashSet<>();
        for(int i = 0; i < m; i++)
            s.add(a[i]);
            int res = 0;
            for (int j = 0; j < n; j++) {
                if (s.contains(b[j])) {
                    res++;
                    s.remove(b[j]);
                }
            }
            return res;
    }

}
