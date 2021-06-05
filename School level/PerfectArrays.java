class Solution{
    
    public boolean IsPerfect(int a[], int n)
    {
        // Complete the function
        for(int i=0;i<n;i++)
        {
            if(a[i]!=a[n-i-1])
            {
                return false;
            }
        }
        return true;
    }
    
}

