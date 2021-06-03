class Solution{
    static ArrayList<Integer> getSum(int N){
        // code here
        ArrayList<Integer> a1=new ArrayList<>();
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=N;i++)
        {
            if(i%2==0)
            {
                sum1+=i;
            }
            else
            {
                sum2+=i;
            }
        }
        a1.add(sum1);
        a1.add(sum2);
        return a1;
    }
}
