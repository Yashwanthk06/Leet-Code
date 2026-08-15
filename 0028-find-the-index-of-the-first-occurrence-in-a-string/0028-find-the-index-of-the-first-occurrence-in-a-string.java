class Solution {
    public int strStr(String haystack, String needle) {
        int i=0;
        int j=0;
        while(j<haystack.length()){
            if(needle.charAt(i)==haystack.charAt(j)){
                if(i==needle.length()-1){
                    return j-(needle.length()-1);
                }
                else{
                    i++;j++;
                }
            }
            else{
                j=j-i+1;
                i=0;
                
            }
        }
        return -1;
    }
}