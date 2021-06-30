class Solution {
    int isDivisible(int N) {
        // code here
        int num=N;
        int sum=0;
        while(num>0)
        {
            sum+=num%10;
            num/=10;
        }
        if(N%sum==0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
};
