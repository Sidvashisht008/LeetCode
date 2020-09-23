class Solution {
    public int maximum69Number (int num) {
        String str = num+"";
        String res = "";
        int cnt = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == '6' && cnt == 0){
                cnt++;
                res+='9';
            }else{
                res+=str.charAt(i);
            }
        }
        return Integer.parseInt(res);
    }
}
