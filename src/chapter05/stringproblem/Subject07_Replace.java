package chapter05.stringproblem;

public class Subject07_Replace {
    public void repalce(char[] chas){
        if(chas==null || chas.length==0)
            return;
        int len = 0;
        int num = 0;
        for(len=0;len<chas.length && chas[len]!=0;len++){
            if(chas[len]==' ')
                num++;
        }
        for(int j=len+num*2-1,i=len-1;i>=0;i--){
            if(chas[i]!=' '){
                chas[j--] = chas[i];
            }else {
                chas[j--] = '0';
                chas[j--] = '2';
                chas[j--] = '%';
            }
        }
    }
    public void modify(char[] chas){
        if(chas==null || chas.length==0)
            return;
        int j=chas.length-1;
        for(int i=chas.length-1;i>=0;i--){
            if(chas[i]!='*'){
                chas[j--] = chas[i];
            }
        }
        while(j>=0){
            chas[j--] = '*';
        }
    }
}
