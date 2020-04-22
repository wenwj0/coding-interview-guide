package chapter05.stringproblem.subject01;

import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "132";
        System.out.println(new Main().isDeformation(str1,str2));
    }
    public boolean isDeformation(String str1, String str2){
        if(str1 == null || str2==null || str1.length()!=str2.length())
            return false;
        int[] map = new int[256];
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        for (char c : char1) {
            map[c]++;
        }
        for (char c : char2) {
            if (map[c]-- <= 0) return false;
        }
        return true;
    }
}
