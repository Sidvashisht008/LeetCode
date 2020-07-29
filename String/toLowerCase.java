class Solution {
    public String toLowerCase(String str) {
        String str1="";
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                str1+=Character.toLowerCase(str.charAt(i));
            }else{
                str1+=str.charAt(i);
            }
        }
        str=str1;
        return str;
    }
}
