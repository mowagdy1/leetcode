class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int[] steps = new int[cost.length+1];
        
        for(int i=0; i< steps.length; i++){
            
            if(i==0 || i==1){
                steps[i] = cost[i];
            }else{
                
                int currentCost=0;
                if(i<cost.length){
                    currentCost = cost[i];
                }
                
                int temp1 = steps[i-1] + currentCost;
                int temp2 = steps[i-2] + currentCost;
                if(temp2<temp1){
                    steps[i] = temp2;
                }else{
                    steps[i] = temp1;
                }
            }
        }
        
        return steps[cost.length];
    }
}