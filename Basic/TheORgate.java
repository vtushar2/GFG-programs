class Solution{
    static int xorGate(int arr[] , int N){
        //code here
        int res=arr[0];
        for(int i=1;i<N;i++)
        {
            res^=arr[i];
        }
        return res;
    }
};
