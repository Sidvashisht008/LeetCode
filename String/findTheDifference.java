class Solution {
    public char findTheDifference(String s, String t) {
        int[] arr = new int[26];
        for(int i = 0;i<s.length();i++){
            arr[(int)(s.charAt(i)-97)]++;
        }
        for(int i = 0;i<t.length();i++){
            arr[(int)(t.charAt(i)-97)]--;
        }
        char ch = '/';
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == -1){
                ch = (char)(i+97);
                break;
            }
        }
        return ch;
    }
}
