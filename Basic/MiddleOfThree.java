class Solution{
    int middle(int A, int B, int C){
        //code here
        int a=Math.max(A,B);
        int b=Math.min(A,B);
        a=Math.max(a,C);
        b=Math.min(b,C);
        return((A+B+C)-a-b);
        
    }
}
