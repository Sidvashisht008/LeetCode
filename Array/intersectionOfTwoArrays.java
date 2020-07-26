import java.util.HashSet;
import java.util.Set;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        Set<Integer> hashSet = new HashSet<>(); 
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<nums1.length && j<nums2.length){
           if(nums1[i] == nums2[j]){
               hashSet.add(nums1[i]);
               i++;
               j++;
           }else if(nums1[i]>nums2[j]){
               j++;
           }else{
               i++;
           }
        }
        int[] arr = new int[hashSet.size()];
        int k =0;
        for(int val:hashSet){
            arr[k++] = val;
        }
        return arr;
    }
}
