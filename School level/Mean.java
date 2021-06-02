class Solution {
    static int mean(int N , int[] A) {
        // code here
        int mean=0;
        for(int i=0;i<N;i++)
        {
            mean=mean+A[i];
        }
        return mean/N;
    }
};
