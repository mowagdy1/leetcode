class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int output =1;

        Set<Integer> numsSet = new HashSet<>();
        for(int i : nums){
            numsSet.add(i);
        }

        while(numsSet.contains(output)){
            output++;
        }
        
        return output;
    }
}