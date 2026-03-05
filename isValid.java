class Solution {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='['||ch=='{'||ch=='(')
                s.push(ch);

            else {
                if(s.isEmpty()){
                    return false;
                }
                char c = s.pop();
                if((c!='(' && ch==')')||
                        (c!='[' && ch==']')||
                        (c!='{' && ch=='}'))
                    return false;
            }
        }
     return s.isEmpty();
    }
}
