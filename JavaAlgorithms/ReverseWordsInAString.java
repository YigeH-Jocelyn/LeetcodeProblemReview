// *****************************************************************************************
class Solution {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        // Chect if the string "s" is null or the length of s is 0

        String[] words = s.split(" ");
        // Split the word/define word using a space.
        StringBuilder fr = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                fr.append(words[i]);
                if (i != 0) {
                    fr.append(" ");
            // if the word is define where there is no space between the characters, the words are appended together and separated by a space. != 0 ensures that there is no space at the end of the reverse string.
                }
            }
        }

        return fr.toString().trim();
        // Trim avoids the unintended leading and trailing whitespace
    }
}

// *******************************************************************************************
