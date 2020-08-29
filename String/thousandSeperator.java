class Solution {
    public String thousandSeparator(int n) {
        String a = n+"";
        String ne = "";
        int cnt = 0;
        for(int i = a.length()-1;i>=0;i--){
            if(cnt%3==0 && i != a.length()-1){
                ne = a.charAt(i) + "."+ne;
            }else{
                ne = a.charAt(i) + ne;
            }
            cnt++;
        }
        return ne;
    }
}
