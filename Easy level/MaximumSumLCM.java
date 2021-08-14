class Solution {
    static int maxSumLCM(int n) {
        // code here
        int sum=0;
        int lm=(int)Math.sqrt(n);
        for(int i=1;i<=lm;i++)
        {
            if(n%i==0)
            {
                if(i==(n/i))
                {
                    sum+=i;
                }
                else
                {
                    sum+=(i+n/i);
                }
            }
        }
        return sum;
    }
}
