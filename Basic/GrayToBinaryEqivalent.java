class Solution{
    
    // function to convert a given Gray equivalent n to Binary equivalent.
    public static int grayToBinary(int n) {
        
        // Your code here
        int m=n;
        int k=n;
        while(m!=0)
        {
            k=n^(k>>1);
            m=m>>1;
        }
        return k;
        
    }
       
}
