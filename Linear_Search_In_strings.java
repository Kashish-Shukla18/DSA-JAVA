package DSA;

public class Linear_Search_In_strings {
public static void main(String[] args){
    String name="Kashish";
    char target='a';
    char target2='h';
    System.out.println(Search(name,target));
    System.out.println(Search2(name,target2));
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
}static boolean Search2(String str, char target){
    if (str.length()==0){
        return false;
    }
    for (char ch:str.toCharArray()){
        if (target==ch){
            return true;
        }
    }
    return false;
}
}
