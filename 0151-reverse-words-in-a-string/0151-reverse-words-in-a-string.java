class Solution {
    public String reverseWords(String s) {
        String a="";
        String [] words = s.trim().split("\\s+");
        for(int i=words.length-1;i>=0;i--){
            a+=words[i];
            if(i!=0){
                a+=" ";
            }
        }
        
        return a;
    }
}