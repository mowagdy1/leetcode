class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int longest = 0;
        int l=0;
        Set<Character> charsSet = new HashSet<>();
        
        for(int r=0; r<s.length(); r++){
            
            while(charsSet.contains( s.charAt(r) )){
                charsSet.remove(s.charAt(l));
                l++;
            }
            
            charsSet.add( s.charAt(r) );
            longest = Math.max( longest, r-l+1 );
        }
        
        return longest;
    }
}