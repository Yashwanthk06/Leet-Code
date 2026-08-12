import java.util.*;
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i=0;            int max=0;
        int j=0;
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        while(j<nums.length){
            if(ht.containsKey(nums[j])){
                ht.put(nums[j],ht.get(nums[j])+1);
                while(ht.get(nums[j])>k){
                    ht.put(nums[i],ht.get(nums[i])-1);
                    i++;}
                    j++;

            }
            else{
                ht.put(nums[j],1);
                j++;
            }
            max=Math.max(max,j-i);
        }
        return max;
    }
}