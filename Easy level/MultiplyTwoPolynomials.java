class Solution
{
    public int[] polyMultiply(int Arr1[], int Arr2[], int M, int N)
    {
        // code here
        int[] res=new int[M+N-1];
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                res[i+j]+=Arr1[i]*Arr2[j];
            }
        }
        return res;
    }
}
