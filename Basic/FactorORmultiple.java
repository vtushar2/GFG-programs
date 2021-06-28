class Solution {
    static int factorOrMultiple(int N,int X,int A[]) {
        // code here
        int sum=0;
        for(int i=0;i<N;i++)
        {
            if(A[i]%X==0)
            {
                sum=sum|A[i];
            }
        }
        return sum;
    }
};
