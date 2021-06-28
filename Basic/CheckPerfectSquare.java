class Solution {
    static long isPerfectSquare(long n){
        // code here
        long s=(long)Math.sqrt(n);
        if(s*s!=n)
        {
            return 0;
        }
        return 1;
    }
}
