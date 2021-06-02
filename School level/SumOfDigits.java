class Solution{
    static int sumOfDigits(int N) {
        // code here
        int sum=0;
        int r=0;
        while(N>0)
        {
            r=N%10;
            sum=sum+r;
            N=N/10;
        }
        return sum;
    }
}
