class Solution {
    public boolean isPalindrome(String s) {

        int l=0;
        int r=s.length() -1;
                
        while(l<r){            
            if ( !isAlphanumeric(s.charAt(l)) ){
                ++l;
            }else if( !isAlphanumeric(s.charAt(r)) ){
                --r;
            }else if( Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)) ){
                return false;
            }else{
                ++l;
                --r;
            }
        }
        return true;
    }

    boolean isAlphanumeric(char c){        
        return ((int) 'A' <= (int) c && (int) c <= (int) 'Z')
                || ((int) 'a' <= (int) c && (int) c <= (int) 'z')
                || ((int) '0' <= (int) c && (int) c <= (int) '9');
    }
}