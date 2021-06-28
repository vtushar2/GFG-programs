class Complete{
    
   
    // Function for finding maximum and value pair
    public static int multiply (int arr[], int n) {
        //Complete the function
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n/2;i++)
        {
            sum1+=arr[i];
        }
        for(int i=n/2;i<n;i++)
        {
            sum2+=arr[i];
        }
        int mul=sum1*sum2;
        return mul;
    }
    
    
}


