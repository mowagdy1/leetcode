class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((e1,e2)->e2-e1);
        for(int stone : stones){
            maxHeap.add(stone);
        }
        
        while(maxHeap.size()>1){
            
            int y = maxHeap.poll();
            int x = maxHeap.poll();
            
            if(x != y){
                maxHeap.add( y-x );
            }
            
        }
        
        if(maxHeap.isEmpty()){
            return 0;
        }else{
            return maxHeap.poll();
        }
    }
}