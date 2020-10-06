class Solution {
    public String sortString(String s) {
        int[] ch = new int[26];
        int count = 0;
        for(int i = 0;i<s.length();i++){
            ch[(int)(s.charAt(i)-97)]++;
            count++;
        }
        String res = "";
        while(count>0){
            for(int i = 0;i<ch.length && count>0;i++){
                if(ch[i]>=1){
                    res +=(char)(i+97);
                    ch[i]--;
                    count--;
                }
            }
            for(int i = ch.length-1;i>=0 && count>0;i--){
                if(ch[i]>=1){
                    res +=(char)(i+97);
                    ch[i]--;
                    count--;
                }
            }    
        }
        return res;
    }
}
