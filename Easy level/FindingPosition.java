class Solution {
    static long nthPosition(long n){
        // code here
        int count=0;
        while(n!=1)
        {
            n/=2;
            count++;
        }
        return (long)Math.pow(2,count);
    }
}
