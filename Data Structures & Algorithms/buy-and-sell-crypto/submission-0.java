class Solution {
    public int maxProfit(int[] prices) {
        

       int left=0,right=1,sum=0,max=0;
       while(right<prices.length){
        if(prices[left]<prices[right]){
            sum=prices[right]-prices[left];
            max=Math.max(max,sum);
          
        }
        else{
            left=right;
        }
        right++;

       }
       return max;
    }
}
