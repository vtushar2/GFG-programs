class Solution
{
    public int find(int[] A, int[] B)
    {
        // code here
        int dot=A[0]*B[0]+A[1]*B[1]+A[2]*B[2];
        if(dot==0)
        {
            return 2;
        }
        int cross=(int)(Math.pow(A[1]*B[2]-A[2]*B[1],2)+
                        Math.pow(A[1]*B[0]-A[0]*B[1],2)+
                        Math.pow(A[0]*B[2]-A[2]*B[0],2));
        if(cross==0)
        {
            return 1;
        }
        return 0;
    }
}
