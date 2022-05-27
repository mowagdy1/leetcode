class Solution {
    public int maxArea(int[] height) {
        
        int max =0;
        
        int l=0;
        int r=height.length-1;
        
        while(l<r){
            int h = Math.min( height[l] , height[r] );
            int w = Math.abs(l-r);
            int area = h*w;
            
            if(area>max){
                max = area;
            }
            
            if(height[l] > height[r]){
                r--;
            }else{
                l++;
            }
        }
        
        return max;
    }
}