package DSA;

import java.util.Arrays;

public class Stringmethods {
    public static void main(String[] args) {
        String name="Kashish Shukla";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());  //does not affect the orignal one
        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('a'));
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
