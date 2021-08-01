class Solution{
    static int NthTermOfSeries(int N){
        // code here
        if(N<=0)
        {
            return 0;
        }
        if(N%2==1)
        {
            return 10*NthTermOfSeries((N-1)/2)+4;
        }
        return 10*NthTermOfSeries((N-1)/2)+7;
    }
}
