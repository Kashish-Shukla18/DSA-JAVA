package DSA;

public class IndexOfOccurence {
    public static void main(String[] args) {
       String haystack = "butsadbutsad";
       String needle = "sad";
        System.out.println(Str(haystack,needle));
    }
    static  int Str(String haystack, String needle){
        for (int i=0;i<haystack.length()-needle.length()+1;i++){
            if (haystack.charAt(i)==needle.charAt(0)){
                if (haystack.substring(i,needle.length()+i).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}
