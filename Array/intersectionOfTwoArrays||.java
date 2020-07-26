class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i =0;
        int j =0;
        ArrayList<Integer> res = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
           if(nums1[i] == nums2[j]){
               res.add(nums1[i]);
               i++;
               j++;
           }else if(nums1[i]>nums2[j]){
               j++;
           }else{
               i++;
           } 
        }
        int[] res2 = new int[res.size()];
        int k =0;
        for(int val:res){
            res2[k++] = val;
        }
        return res2;
    }
}
