class Solution{
    static void printFloydTriangle(int N){
        // code here
        int k=1;
        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
