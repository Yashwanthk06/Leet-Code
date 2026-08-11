class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int a[]=new int[candies.length];
        for(int i=0;i<candies.length;i++){
            a[i]=candies[i];
        }
        Arrays.sort(a);
        int i=0;
        while(i<candies.length){
            if(candies[i]+extraCandies >= a[a.length-1]){
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