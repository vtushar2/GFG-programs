class Solution{
    static long nearestPowerOf2(long N){
        //code here
        long M,res,count=0;
        M=N;
        while(N>0)
        {
            N/=2;
            if(N>0)
            {
                count++;
            }
        }
        if(Math.pow(2,count)>=M)
        {
            res=(long)Math.pow(2,count);
            return res;
        }
        else
        {
            count++;
            res=(long)Math.pow(2,count);
            return res;
        }
    }
}
