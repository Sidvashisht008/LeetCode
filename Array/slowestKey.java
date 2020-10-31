class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int[] res = new int[releaseTimes.length];
        res[0] = releaseTimes[0];
        for(int i = 1;i<res.length;i++){
            res[i] = releaseTimes[i] - releaseTimes[i-1];
        }
        char ch = ' ';
        int t = 0;
        for(int i =0;i<keysPressed.length();i++){
            if(res[i]>t){
                t = res[i];
                ch = keysPressed.charAt(i);
            }else if(res[i]==t && keysPressed.charAt(i)>ch){
                t = res[i];
                ch = keysPressed.charAt(i);
            }
        }
        return ch;
    }
}
