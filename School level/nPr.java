class Solution{
    static long nPr(long n, long r){
        // code here
        long fact1=1;
        long fact2=1;
        for(int i=1;i<=n;i++)
        {
            fact1=i*fact1;
        }
        long temp=n-r;
        for(int i=1;i<=temp;i++)
        {
            fact2=fact2*i;
        }
        long p=fact1/fact2;
        return p;
    }
}
