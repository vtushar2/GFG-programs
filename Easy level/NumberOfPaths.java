class Solution{
    
    long numberOfPaths(int m, int n) {
        // Code Here
        if(m==0 && n==0)
        {
            return 0;
        }
        if(m==1 || n==1)
        {
            return 1;
        }
        return numberOfPaths(m-1,n)+numberOfPaths(m,n-1);
    }
    
}
