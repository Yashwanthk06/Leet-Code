class Solution {
    public int missingInteger(int[] nums) {
        int j=nums[0];
        int i=0;
        int sum=0;
        while(i<nums.length){
            if(j==nums[i]){
                sum=sum+nums[i];
                i++;j++;
            }
            else{
                break;
            }
        }
        while(true){
            boolean a=false;
        for(i=0;i<nums.length;i++){
            if(nums[i]== sum){
                a=true;
                break;
            }}
            if(!a){
                return sum;
            }
            else{
                sum++;
            }
        }
        }
    }