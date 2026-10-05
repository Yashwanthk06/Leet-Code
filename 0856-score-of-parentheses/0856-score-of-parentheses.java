class Solution {
    public int scoreOfParentheses(String s) {
        int a=0;
        int value=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                a=a+1;
            }
            else{
                a=a-1;
                if(s.charAt(i-1)=='('){
                    value+=(int)Math.pow(2, a);
                }
            }
        }
        return value;
    }
}