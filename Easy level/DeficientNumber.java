class Solution {
    static String isDeficient(long x){
        // code here
        long sum=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum>2*x)
        {
            return "NO";
        }
        else
        {
            return "YES";
        }
    }
}
