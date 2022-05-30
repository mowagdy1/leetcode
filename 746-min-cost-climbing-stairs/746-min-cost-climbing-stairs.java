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
                
                steps[i] = Math.min(steps[i-1]+currentCost, steps[i-2]+currentCost);
            }
        }
        
        return steps[cost.length];
    }
}