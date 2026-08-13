import java.util.*;
class Solution {
    public int maxOperations(int[] nums, int k) {
        Hashtable< Integer, Integer> t = new Hashtable<>();
        int count=0;
        int a=0;
        int i=0;
        while(i<nums.length){
            a=k-nums[i];
            if(t.containsKey(a)&& t.getOrDefault(a, 0) > 0){
                count++;
                t.put(a,t.get(a)-1);
                i++;
            }
            else{
                if(t.containsKey(nums[i])){
                t.put(nums[i],t.get(nums[i])+1);
                i++;}
                else{
                    t.put(nums[i],1);
                    i++;
                }
            }
        }
        return count;
    }
}