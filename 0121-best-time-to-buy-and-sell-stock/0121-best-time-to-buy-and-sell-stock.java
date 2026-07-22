class Solution {
    public int maxProfit(int[] prices) {
        int minsum=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int price:prices){
            if(price<minsum){
                minsum=price;
            }
            else{
                maxprofit=Math.max(maxprofit,price-minsum);
            }
        }
        return maxprofit;
    }
}