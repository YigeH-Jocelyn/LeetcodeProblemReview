// *****************************************************************************************
class Solution {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        String[] words = s.split(" ");
        StringBuilder fr = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                fr.append(words[i]);
                if (i != 0) {
                    fr.append(" ");
                }
            }
        }

        return fr.toString().trim();
    }
}

// *******************************************************************************************
