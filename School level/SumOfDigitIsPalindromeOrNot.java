class Solution {
    int isDigitSumPalindrome(int N) {
        // code here
        int sum=0;
        int r=0;
        while(N>0)
        {
            r=N%10;
            sum=sum+r;
            N=N/10;
        }
        int temp=sum;
        int s=0;
        int t=0;
        while(temp>0)
        {
            t=temp%10;
            s=s*10+t;
            temp=temp/10;
        }
        if(sum==s)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
