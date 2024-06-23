class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        int tar = target;
        int out = 0;

        while(start <= end){
            int mid = start + (end-start)/2;
            int current = letters[mid];

            if(current == tar){
                start = mid+1;
            }else if(current < tar){
                start = mid+1;
            }else{
                out = mid;
                end = mid-1;
            }
        }   
        return letters[out];
    }
}
