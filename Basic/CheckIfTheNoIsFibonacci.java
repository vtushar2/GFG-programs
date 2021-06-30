class Solution{
    static String checkFibonacci(int N){
        // code here
        int n1=N*N*5+4;
        int n2=N*N*5-4;
        int n3=(int)Math.sqrt(n1);
        int n4=(int)Math.sqrt(n2);
        if(n3*n3==n1 || n4*n4==n2)
        {
            return "Yes";
        }
        else
        {
            return "No";
        }
    }
}
