class Solution {
    public int removePalindromeSub(String s) {
        int l = s.length();
        if(l==0){
            return 0;
        }
        for(int i=0;i<l/2;i++){
            if(s.charAt(i)!=s.charAt(l-1-i)){
                return 2;
            }
        }
        return 1;
    }
}
