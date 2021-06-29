class Solution {
    static long commDiv(long a, long b){
        // code here
        long count=0;
        for(int i=1;i<Math.min(a,b);i++)
        {
            if(a%i==0 && b%i==0)
            {
                count++;
            }
        }
        return count;
        
    }
}
