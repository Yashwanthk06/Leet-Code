class Solution {
    public int largestAltitude(int[] gain) {
        int i=0;
        int max=0;
        int b=gain[0];
        if(gain.length==1){
            if(gain[0]>max){
                max=gain[0];
            }
        }
        else{
            if(gain[0]>max){
                max=gain[0];
            }
        while(i<gain.length-1){
            b=b+gain[i+1];
            if(b>max){
                max=b;
                i++;
            }
            else{
                i++;
            }
        }}
        return max;
    }
}