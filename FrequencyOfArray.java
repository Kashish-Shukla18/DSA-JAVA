package DSA;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArray {
    public static void main(String[] args) {
        int[] arr={50,50,10,40,10};
        countFreq(arr);
    }
    static void countFreq(int[] arr){
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int x:arr)
            h.put(x,h.getOrDefault(x,0)+1);
        for (Map.Entry<Integer,Integer> e:h.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }

}
