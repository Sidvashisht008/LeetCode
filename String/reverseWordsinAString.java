class Solution {
    public String reverseWords(String s) {
        String[] spl = s.split(" ");
        for(int i = 0;i<spl.length;i++){
            spl[i] = reverse(spl[i]);
        }
        s="";
        for(int i = 0;i<spl.length;i++){
            s+=spl[i]+" ";
        }
        s= s.trim();
        return s;
    }
    public String reverse(String str){
        String n="";
        for(int i = str.length()-1;i>=0;i--){
            n+=str.charAt(i);
        }
        str = n;
        return str;
    }
}
