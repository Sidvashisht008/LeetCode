class Solution {
    public String generateTheString(int n) {
        StringBuilder s = new StringBuilder();
        for(int i =0 ; i< (n-1);i++){
            s.append("a");
        }
        if(n%2 == 0)
            s.append("b");
        else{
            s.append("a");
        }
        return s.toString();
    }
}
