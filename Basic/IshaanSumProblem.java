class Solution {
    static long kthDistinct(long A, long B){
        // code here
        long C=A/B;
        if(C>=(B/2))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
