class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> a = new HashMap<>();
        HashMap<Integer, Integer> b = new HashMap<>();
        List<List<Integer>> outerList = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(a.containsKey(nums1[i])){
            a.put(nums1[i],a.get(nums1[i])+1);
            }
            else{
                a.put(nums1[i],1);
            }}
        for(int i=0;i<nums2.length;i++){
            if(b.containsKey(nums2[i])){
            b.put(nums2[i],b.get(nums2[i])+1);
            }
            else{
                b.put(nums2[i],1);
            }
        }
        for(int i=0;i<nums1.length;i++){
            if(b.containsKey(nums1[i])){
                continue;
            }
            else{
                if(list1.contains(nums1[i])){
                    continue;
                }
                else{
                list1.add(nums1[i]);}
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(a.containsKey(nums2[i])){
                continue;
            }
            else{
                if(list2.contains(nums2[i])){
                    continue;
                }
                else{
                list2.add(nums2[i]);}
            }
        }
        outerList.add(list1);
        outerList.add(list2);
        return outerList;
    }
}