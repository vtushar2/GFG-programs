class Solution {
    static String isKrishnamurthy(int N) {
        // code here
        int sum=0;
        int c=N;
        while(N!=0)
        {
            sum+=factorial(N%10);
            N/=10;
        }
        if(sum==c)
        {
            return "YES";
        }
        return "NO";
    }
    static int factorial(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
};
