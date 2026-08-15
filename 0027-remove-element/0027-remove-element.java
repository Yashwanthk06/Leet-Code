class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();
        int i=0;
        for( i=0;i<nums.length;i++){
            if(nums[i]!=val){
                list.add(nums[i]);
            }
            else{

            }
        }
        i=0;
        while(i<list.size()){
            nums[i]=list.get(i);
            i++;
        }
        while(i<nums.length){
            nums[i]=0;
            i++;
        }
        return list.size();
    }
}