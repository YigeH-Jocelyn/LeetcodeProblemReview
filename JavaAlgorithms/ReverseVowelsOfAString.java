// *************************************************************************************************************
class Solution {
    public String reverseVowels(String s) {
        if(s == null || s.length() == 0){
            return s;
        }
      // If the string s has a length of 0 or it is empty, return s
        char[] chars = s.toCharArray();
        String vowels = "AEIOUaeiou";
      // Set the lowercase and uppercase of the vowels
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            while(left < right && vowels.indexOf(chars[left]) == -1){
                left++;
            }
            while(left < right && vowels.indexOf(chars[right]) == -1){
                right--;
            }
          // From both left side and right side, check if the character of 'chars' at position 'left' exsists. If it doesn't exist (== -1), move to the next character in chars 
            if(left < right){
                char b = chars[left];
                chars[left] = chars[right];
                chars[right] = b;
                left++;
                right--;
            }
          // switch two vowels find in 'chars', and continue with next pairs of vowels
        }
        return new String(chars);
    }
}
// *************************************************************************************************************
