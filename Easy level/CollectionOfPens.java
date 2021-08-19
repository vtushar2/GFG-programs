class Solution
{
    public int minThirdPiles(int A, int B)
    {
        // code here
        int i=1,sum;
        sum=A+B;
        while(i>=1)
        {
            sum++;
            if(isPrime(sum)==1)
            {
                return i;
            }
            i++;
        }
        return i;
    }
    static int isPrime(int n)
    {
        if(n==1 || n==2)
        {
            return n-1;
        }
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
}
