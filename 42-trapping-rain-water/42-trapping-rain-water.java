class Solution {
    public int trap(int[] height) {

        int total = 0;
        int[] maxL = new int[height.length];
        int[] maxR = new int[height.length];
        int[] minLR = new int[height.length];

        for(int i=0; i<height.length; i++){
            if(i==0){
                maxL[0]=0;
                maxR[height.length-1]=0;
            }else{
                maxL[i]= Math.max( height[i-1], maxL[i-1]);
                maxR[height.length-1-i]= Math.max( height[height.length-i], maxR[height.length-i]);
            }
        }

        for(int i=0; i<height.length; i++){
           minLR[i] = Math.min( maxL[i], maxR[i] );
        }

        for(int i=0; i<height.length; i++){
            if( minLR[i] - height[i] > 0 ){
                total += minLR[i] - height[i];
            }
        }

        return total;
    }
}