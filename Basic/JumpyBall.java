class Solution{
    static long jumpyBall(long N){
        // code here
        long sum=0, x=N;
        while(x>0)
        {
            sum+=(2*x);
            x/=2;
        }
        return sum;
    }
}
