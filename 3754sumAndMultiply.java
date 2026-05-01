class Solution {
    public long sumAndMultiply(int n) {
        int sum = 0;
        int rev = 0;
        
        while(n!=0){
            if(n%10!=0){
                rev=rev*10+n%10;
                sum+=n%10;
            }
            n/=10;
        }

 long l=0;

 while(rev!=0){
    l=l*10+rev%10;
    rev/=10;
 }

        return l*sum;
    }
}
