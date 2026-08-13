class Solution {
    public boolean isSubsequence(String s, String t) {
       int [] a=new int[s.length()];
       int [] b=new int[t.length()];
       for(int i=0;i<s.length();i++){
        a[i]=s.charAt(i);
       } 
       for(int i=0;i<t.length();i++){
        b[i]=t.charAt(i);
       }
       int i=0;
       int j=0;
       while(i<s.length() && j<t.length()){
        if(a[i]==b[j]){
            i++;j++;
        }
        else{
            j++;
        }
       }
       return i==a.length;
    }
}