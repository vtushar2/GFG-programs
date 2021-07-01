class Solution {
    int maxProduct(int arr[], int n) {
        // code here
        int mul=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            mul=arr[n-1]*arr[n-2];
        }
        return mul;
    }
}
