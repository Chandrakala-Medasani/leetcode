class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        
        // Return the length of the last word
        return words[words.length - 1].length();
    }
}
