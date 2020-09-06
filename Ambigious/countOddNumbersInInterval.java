class Solution {
    public int countOdds(int low, int high) {
        if ((high-low)%2==0){
            return high %2 == 0 ? (high-low)/2:(high-low)/2+1;
        }    
        return (high-low)/2+1;
    }
}
