class Solution {
    public int hammingWeight(int n) {
        return count(n);
    }

    private int count(int n){
        int count=0;

        while(n!=0){
            if(n%2==1)
                count++;
            n/=2;
        }

        return count;
    }
}
