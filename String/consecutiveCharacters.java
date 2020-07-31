class Solution {
    public int maxPower(String s) {
        int maxChar = 1;
        for(int i = 0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                int tempMax = 1;
                while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                    tempMax++;
                    i++;
                }
                if(tempMax>maxChar){
                    maxChar =  tempMax;
                }
            }
        }
        return maxChar;
    }
}
