class Solution {
    private class LargerNumberComparator implements Comparator<String> {
        public int compare(String a, String b) {
            String order1 = a + b;
            String order2 = b + a;
           return order2.compareTo(order1);
        }
    }
    public String largestNumber(int[] nums) {
        
        String[] str = new String[nums.length];
        for(int i =0 ;i<nums.length;i++){
            str[i] = nums[i]+"";
        }
        Arrays.sort(str,new LargerNumberComparator());
        if(Integer.parseInt(str[0]) == 0){
            return "0";
        }
        String a ="";
        for(String val:str){
            a+=val;
        }
        return a;
    }
}
