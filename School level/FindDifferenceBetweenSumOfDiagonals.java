class Solution {
    int diagonalSumDifference(int N, int[][] Grid) {
        // code here
        int d1=0;
        int d2=0;
        for(int i=0;i<N;i++)
        {
            d1+=Grid[i][i];
            d2+=Grid[i][N-i-1];
        }
        return Math.abs(d1-d2);
    }
}
