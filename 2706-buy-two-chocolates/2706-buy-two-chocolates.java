class Solution {
    public int buyChoco(int[] prices, int money) {
        int c=money;
        Arrays.sort(prices);
        int b=prices[0]+prices[1];
        if(money>=b){
            return money-b;
        } 
        return c;       
    }
}