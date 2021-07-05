class Solution {
    static int revCoding(int n, int m) {
        // code here
        int k=(int)n*(n+1)/2;
        if(k!=m)
        {
            return 0;
        }
        return 1;
    }
};
