class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        for(int i = 0;i<s.length();i++){
            arr[(int)(s.charAt(i)-97)]++;
        }
        for(int j = 0;j<t.length();j++){
            arr[(int)(t.charAt(j)-97)]--;
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}
