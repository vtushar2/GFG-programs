class Solution{
    static int makeNumberOdd(int N){
        // code here
        int b=N;
        if(N%2!=0)
        return 1;
        while(b>0 && b%2==0)
        {
            b=b/2;
        }
        return N/b;
    }
}
