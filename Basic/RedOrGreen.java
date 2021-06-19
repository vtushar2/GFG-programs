class Solution {
    static int RedOrGreen(int N, String S) {
        //code here
        int red=0, green=0;
        for(int i=0;i<N;i++)
        {
            if(S.charAt(i)=='R')
            {
                red++;
            }
            else
            {
                green++;
            }
        }
        return Math.min(red,green);
    }
}
