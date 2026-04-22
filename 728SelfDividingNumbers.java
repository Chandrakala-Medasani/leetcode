class Solution {

    public boolean division(int num){
        int temp = num;
        while(num>0){
            int rem = num%10;
            if(rem==0)
                return false;
            if(temp%rem!=0)
                return false;
            num/=10;
                
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ls = new ArrayList<Integer>();
        for(int i=left; i<=right;i++){
            if(division(i))
                ls.add(i);
        }
        return ls;
    }
}
