class Solution {
    static long sumOfTheSeries(long n){
        // code here
        int count=0;
        int count1=0;
        for(int i=1;i<=n;i++)
        {
            count+=i;
            count1+=count;
        }
        return count1;
    }
}
