

*************************************************************************************************
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max = 0;
        int left = 0;
        int[] charIndex = new int[128];
        Arrays.fill(charIndex, -1);
  // Create an array with a size corresponding to the ASCII table. Initializing the array with "-1" to represent that the corresponding character haven't been met.
  
        for(int right = 0; right < n; right++){
            if (charIndex[s.charAt(right)] >= left) {
                left = charIndex[s.charAt(right)]+1;
              // When the corresponding ASCII index of the character at position "right" is larger than the position of character at "left", the next character will be processed. 
              // If the character is met before, where the ASCII index is smaller than "left", the iteration/calculation for "left" will not be processed.
            }
            charIndex[s.charAt(right)] = right;
          // This replace the ASCII index of the corresponding symbol with the position of the character, allowing track back. 
            max = Math.max(max, right-left+1);
          // Compare the max length of the substring between the last iteration and the current iteration.
        }
        return max;
  // The loop ends if the whole string is calculated, where right > n.
    }
}
***************************************************************************************************
