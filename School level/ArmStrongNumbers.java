class Solution {
    static String armstrongNumber(int n){
        // code here
        int x=n;
        int r=0;
        int sum=0;
        while(n>0)
        {
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(sum==x)
        {
            return "Yes";
        }
        else
        {
            return "No";
        }
    }
}
