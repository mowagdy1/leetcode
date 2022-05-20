class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> numsSet = new HashSet<>();
        for(int i=0; i< nums.length; i++){
            numsSet.add(nums[i]);
        }
        
        int longest =0;
        for(int i=0; i< nums.length; i++){
            
            if( !numsSet.contains(nums[i]-1) ){
                int length =1;
                while( numsSet.contains(nums[i] + length) ){
                    ++length;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }
}