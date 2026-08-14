import java.util.*;
class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max=0;
        int i=0;
        int j=0;
        while(j<s.length()){
            if(map.containsKey(s.charAt(j))){
                if(map.get(s.charAt(j))>=2){
                    while(map.get(s.charAt(j))>=2){
                        map.put(s.charAt(i),map.get(s.charAt(i))-1);
                        i++;
                    }
                    map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
                    j++;
                }
                else{
                    map.put(s.charAt(j),map.get(s.charAt(j))+1);
                    j++;
                }
            }
            else{
                map.put(s.charAt(j),1);
                j++;
            }
            max=Math.max(max,j-i);
        }
        return max;
    }
}