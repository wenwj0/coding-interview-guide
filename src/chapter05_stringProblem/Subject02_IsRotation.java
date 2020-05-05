package chapter05_stringProblem;

public class Subject02_IsRotation {
    public boolean isRotation(String str1, String str2){
        if(str1==null || str2==null || str1.length()!=str2.length())
            return false;
        String str = str2 + str2;
        return str.contains(str1);
    }
}
