class Solution{
    static int isBitSet(int N){
        //code here
        int i=N^(N>>1);
        if(i==(N+1)/2)
        {
            return 1;
        }
        return 0;
    }
}
