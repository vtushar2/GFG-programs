class Solution
{
    //Function to swap odd and even bits.
    public static int swapBits(int n) 
    {
	    // Your code
	    return ((n&0x55555555)<<1)|((n&0xAAAAAAAA)>>1);
	}
    
}
