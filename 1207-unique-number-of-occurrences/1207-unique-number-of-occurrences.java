class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int j=arr[0];
        int count=0;
        List<Integer> lists = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==j){
                count++;
            }
            else{
                lists.add(count);
                count=0;
                j=arr[i];
                i--;
            }
        }
        lists.add(count);
        Collections.sort(lists);
        for(int i=0;i<lists.size()-1;i++){
            if(lists.get(i).equals(lists.get(i+1))){
                return false;
            }
        }
        return true;
    }
}