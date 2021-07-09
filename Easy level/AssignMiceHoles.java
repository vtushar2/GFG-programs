class Solution {
    static int assignMiceHoles(int N , int[] M , int[] H) {
        // code here
        Arrays.sort(M);
        Arrays.sort(H);
        int max=0;
        for(int i=0;i<N;i++)
        {
            int diff=Math.abs(M[i]-H[i]);
            if(diff>max)
            {
                max=diff;
            }
        }
        return max;
    }
};
