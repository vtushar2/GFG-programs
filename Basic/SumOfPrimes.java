class Solution{
    static int primeSum(int N){
        // code here
        int r=0;
        int sum=0;
        while(N>0)
        {
            r=N%10;
            if(r==2||r==3||r==5||r==7)
            {
                sum+=r;
            }
            N=N/10;
        }
        return sum;
    }
}
