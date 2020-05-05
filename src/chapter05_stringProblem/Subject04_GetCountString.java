package chapter05_stringProblem;

public class Subject04_GetCountString {
    public String getCountString(String str){
        if(str==null || str.length()==0)
            return null;
        char[] chars =str.toCharArray();
        int cnt = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(chars[0]);
        for(int i=1;i<chars.length;i++){
            if(chars[i]!=chars[i-1]){
                sb.append("_").append(cnt).append("_").append(chars[i]);
                cnt = 1;
            }else {
                cnt++;
            }
        }
        sb.append("_").append(cnt);
        return sb.toString();
    }
    public char getCharAt(String cstr,int index){
        if(cstr == null || cstr.equals("")){
            return 0;
        }
        char[] chs = cstr.toCharArray();
        boolean stage = true;
        char cur = 0;
        int num = 0;
        int sum = 0;
        for(int i=0;i!=chs.length;i++){
            if(chs[i]=='_'){
                stage = !stage;
            }else if(stage){
                sum += num;
                if(sum>index){
                    return cur;
                }
                num = 0;
                cur = chs[i];
            }else{
                num = num * 10 + chs[i] - '0';
            }
        }
        return sum + num > index ? cur : 0;
    }
}
