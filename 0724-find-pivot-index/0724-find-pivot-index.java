class Solution {
    public int pivotIndex(int[] nums) {
        int i=0;
        int sum1=0;
        int sum=0;
        boolean a= false;
        for(i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        i=0;
        while(i<nums.length){
            sum-=nums[i];
            if(sum1==sum){
                return i;
            }
            sum1+=nums[i];
            i++;
        }
        return -1;
    }
}