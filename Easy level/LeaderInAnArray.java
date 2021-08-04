class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> a1=new ArrayList<Integer>();
        int max=arr[n-1];
        a1.add(max);
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>=max)
            {
                a1.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(a1);
        return a1;
    }
}
