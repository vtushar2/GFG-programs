class Solution {
    static String computeParity(int N) {
        // code here
        int c=0;
        while(N>0)
        {
            if(N%2==1)
            {
                c++;
            }
            N/=2;
        }
        if(c%2==0)
        {
            return "even";
        }
        else
        {
            return "odd";
        }
    }
};
