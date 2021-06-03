class Solution {
    ArrayList<Integer> EvenOddSum(int N, int Arr[]) {
        // code here
        int sum1=0;
        int sum2=0;
        ArrayList<Integer> a1=new ArrayList<>();
        for(int i=0;i<N;i++)
        {
            if(i%2==0)
            {
                sum1=sum1+Arr[i];
            }
            else
            {
                sum2=sum2+Arr[i];
            }
        }
        a1.add(sum1);
        a1.add(sum2);
        return a1;
    }
}
