package chapter05.stringproblem.subject02;

public class Main {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cba";
        System.out.println(new Main().isRotation(str1,str2));
    }
    public boolean isRotation(String str1, String str2){
        if(str1==null || str2==null || str1.length()!=str2.length())
            return false;
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        for(int i=0;i<char1.length;i++){
            if(char1[i] != char2[char2.length-i-1])
                return false;
        }
        return true;
    }
}
