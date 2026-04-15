class Solution {
    public int reverseBits(int n) {
       String s = new StringBuilder(isBinary(n)).reverse().toString();
       return integerr(s); 
    }

    private String isBinary(int n){
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=32; i++){
            sb.append(n%2);
            n/=2;
        }

        return sb.reverse().toString();
    }

    private int integerr(String s){
        long result = 0;
        for (int i = 0; i < 32; i++) {
            result = result * 2 + (s.charAt(i) - '0');
        }
        return (int) result;
    }
}
