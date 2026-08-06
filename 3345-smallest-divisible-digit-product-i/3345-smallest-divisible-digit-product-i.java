class Solution {
    public int smallestNumber(int n, int t) {
        int a=n;
        int c=1;
        int b,d;
            while(true){
            while(n>0 ){
                d=n%10;
                n=n/10;
                c=c*d;
            }
            if(c%t==0){
                break;
            }
            else{
                a++;
                n=a;
                c=1;
            }
            }
            return a;
    }
}