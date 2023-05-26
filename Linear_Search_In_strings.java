package DSA;

public class Linear_Search_In_strings {
public static void main(String[] args){
    String name="Kashish";
    char target='a';
    System.out.println(Search(name,target));
}
static boolean Search(String str, char target){
    if (str.length()==0){
        return false;
    }
    for (int i=0;i<str.length();i++){
        if (target==str.charAt(i)){
            return true;
        }
    }
    return false;
}
}
