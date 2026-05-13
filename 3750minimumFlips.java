class Solution {
    public int minimumFlips(int n) {
        int temp=n;
        int count=0;
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n%2);
            n/=2;
        }
        String s = sb.reverse().toString();
       String rev = new StringBuilder(s).reverse().toString();

        // compare each bit with its reversed position
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != rev.charAt(i)) {
                count++;
            }
        }

        return count;
    }
}
