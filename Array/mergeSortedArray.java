class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        for(int strt = m;strt<nums1.length;strt++){
            nums1[strt] = Integer.MAX_VALUE;
        }
        while(j<nums2.length){
            if(nums2[j]>nums1[i]){
                i++;
            }else{
                for(int last = m;last>i;last--){
                    nums1[last] = nums1[last-1];
                }
                m++;
                nums1[i] = nums2[j];
                i++;
                j++;
            }
        }
    }
}
