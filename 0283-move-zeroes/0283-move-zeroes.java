class Solution {
    public void moveZeroes(int[] nums) {
        int a=0;
        int b=0;
        while(b<nums.length){
            if(nums[b]!=0){
                nums[a]=nums[b];
                a++;
            }
            b++;
        }
        for(int i=a;i<nums.length;i++){
            nums[i]=0;
        }
        
    }
}