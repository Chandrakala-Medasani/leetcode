class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count=0;
        int i=0,j=0;
        //char c = s.charAt(0);
        StringBuilder sb = new StringBuilder();
        while(j<s.length()){
            Character ch = s.charAt(j);
            if(sb.indexOf(ch.toString())==-1){
                sb.append(ch);
                if(count<sb.length())
                    count=sb.length();
                j++;
            }
            else{
                if(i<j)
                    sb.deleteCharAt(0);
                else
                    j++;
            }
        }
        return count;
    }
}
