class Solution {
    
    public long leftElement(long arr[], long n)
    {
        // Your code goes here 
        Arrays.sort(arr);
        int mid=(int)n/2;
        if(n%2==0)
        {
            return arr[mid-1];
        }
        return arr[mid];
    }
}
