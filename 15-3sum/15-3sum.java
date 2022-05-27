class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> output = new HashSet<>();

        if(nums.length <3){
            return new ArrayList<>(output);
        }

        Arrays.sort(nums);

        for(int i=0; i< nums.length; i++){

            int l=0;
            int r=nums.length-1;

            while(l<r){

                int sum = nums[l] + nums[r] + nums[i];

                if(i==l || sum<0){
                    l++;
                }else if(i==r || sum>0){
                    r--;
                }else{
                    if(i>r){
                        output.add(Arrays.asList(nums[l],nums[r],nums[i]));
                    }else if(i<l){
                        output.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    }else{
                        output.add(Arrays.asList( nums[l],nums[i],nums[r] ));
                    }
                    l++;
                    r--;
                }
            }

        }
        return new ArrayList<>(output);
    }
}