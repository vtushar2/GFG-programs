
class Complete{
    
   
    // Function for finding maximum and value pair
    public static int chocolates (int arr[], int n) {
        //Complete the function
        int min=arr[0];
        for(int i=0;i<n;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        return min;
    }
    
    
}
