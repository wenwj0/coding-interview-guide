package chapter05.stringproblem.subject02;

public class Main {
    public static void main(String[] args) {
        String str1 = "cdab";
        String str2 = "abcd";
        System.out.println(new Main().isRotation(str1,str2));
    }
    public boolean isRotation(String str1, String str2){
        if(str1==null || str2==null || str1.length()!=str2.length())
            return false;
        String str = str2 + str2;
        return str.contains(str1);
    }
}
