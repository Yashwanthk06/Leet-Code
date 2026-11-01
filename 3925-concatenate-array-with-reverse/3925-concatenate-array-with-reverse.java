class Solution {
    public int[] concatWithReverse(int[] nums) {
        int arr[]=new int[2*nums.length];
        int i=0,a=0;
        for( i=0;i<nums.length;i++){
            arr[a]=nums[i];
            a++;
        }
        for(i=nums.length-1;i>=0;i--){
            arr[a]=nums[i];
            a++;
        }
        return arr;
    }
}