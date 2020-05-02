package chapter05.stringproblem;

public class Subject08_RotateWord {
    public static void main(String[] args) {
        String str = "I'm a student.";
        char[] chas = str.toCharArray();
        new Subject08_RotateWord().rotateWord(chas);
        System.out.println(chas);
    }
    public void rotateWord(char[] chas){
        if(chas==null || chas.length==0)
            return;
        reverse(chas,0,chas.length-1);
        int l = -1;
        int r = -1;
        for(int i=0;i<chas.length;i++){
            if(chas[i]!=' '){
                l = i==0||chas[i-1]==' '?i:l;
                r = i==chas.length-1||chas[i+1]==' '?i:r;
            }
            if(l != -1 && r !=-1){
                reverse(chas,l,r);
                l = -1;
                r = -1;
            }
        }
    }
    public void reverse(char[] chas,int left, int right){
        if(chas==null || chas.length==0)
            return;
        while(left<right){
            char temp = chas[left];
            chas[left] = chas[right];
            chas[right] = temp;
            left++;right--;
        }
    }
}
