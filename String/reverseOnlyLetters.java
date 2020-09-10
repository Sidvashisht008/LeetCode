class Solution {
    public String reverseOnlyLetters(String S) {
        char[] ch = S.toCharArray();
        int i = 0;
        int j = ch.length-1;
        while(i<j){
            while((i<j) &&  !((ch[i]>='a' && ch[i]<='z') || (ch[i]>='A' && ch[i]<='Z'))){
                i++;
            }
            while((i<j) &&  !((ch[j]>='a' && ch[j]<='z') || (ch[j]>='A' && ch[j]<='Z'))){
                j--;
            }
            if(i<j){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }
        String str = "";
        for(char c:ch){
            str+=c;
        }
        return str;
    }
}
