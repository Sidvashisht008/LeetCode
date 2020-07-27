class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                str+=Character.toLowerCase(s.charAt(i));
            }else if(Character.isDigit(s.charAt(i))){
                str+=s.charAt(i);
            }
        }
        s=str;
        int i =0;
        int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
