class Solution{
    static int bitMultiply(int N){
        // code here
        int sum=N;
        int count=0;
        while(N>0)
        {
            if(N%2==1)
            {
                count++;
            }
            N=N/2;
        }
        return sum*count;
        
    }
}
