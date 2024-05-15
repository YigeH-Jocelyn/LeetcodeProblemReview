// ***************************************************************************************************************
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder fr = new StringBuilder();
      // Set up a string holder for tracking
        int i = 0;
        while(i < word1.length() || i < word2.length()) {
            if(i < word1.length()){
                fr.append(word1.charAt(i));
            }
            if(i < word2.length()){
                fr.append(word2.charAt(i));
            }
            i++;
        }
        return fr.toString();
    }
}
// ****************************************************************************************************************
