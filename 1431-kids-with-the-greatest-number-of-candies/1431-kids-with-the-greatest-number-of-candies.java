class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int a[]=new int[candies.length];
        int max = candies[0];
        for(int i = 1; i < candies.length; i++) {
        if(candies[i] > max) {
        max = candies[i];
    }
}
        int i=0;
        while(i<candies.length){
            if(candies[i]+extraCandies >= max){
                list.add(true);
                i++;
            }
            else{
                list.add(false);
                i++;
            }
        }
        return list;
    }
}