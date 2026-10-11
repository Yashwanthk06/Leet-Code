class Solution {
    public int sumOfSquares(int[] nums) {
        List<Integer> a = new ArrayList<>();
        int sum=0;
        for(int i=1;i<=nums.length;i++){
            if(nums.length % i ==0){
                a.add(nums[i-1]);
            }
        }
        for(int i=0;i<a.size();i++){
            sum=sum+(a.get(i)*a.get(i));
        }
        return sum;
    }
}