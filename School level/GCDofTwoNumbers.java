class Solution
{
    public int gcd(int A , int B) 
    { 
        //code here
        if(A==0)
        {
            return B;
        }
        if(B==0)
        {
            return A;
        }
        if(A==B)
        {
            return A;
        }
        if(A>B)
        {
            return gcd(A-B,B);
        }
        return gcd(B-A,A);
    } 
}
