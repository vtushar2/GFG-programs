//User function Template for Java
class Solution{
    static int swapNibbles(int N) {
        //code here
        int a=N/16;
        int b=N%16;
        return a+16*b;
    }
}
