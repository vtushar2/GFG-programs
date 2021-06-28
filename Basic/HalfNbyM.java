class Solution{
    static int mthHalf(int N, int M){
        // code here
        while(M-1>0 && N>0)
        {
            N=N/2;
            M--;
        }
        return N;
    }
}
