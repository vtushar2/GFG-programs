class Solution{
    public:
    // Function to find number of bits needed to be flipped to convert A to B
    int countBitsFlip(int a, int b){
        
        // Your logic here
        int c=0;
        while(a>0 || b>0)
        {
            int a_bit=a&1;
            int b_bit=b&1;
            if(a_bit!=b_bit)
            {
                c++;
            }
            a>>=1;
            b>>=1;
        }
        return c;
        
    }
};
