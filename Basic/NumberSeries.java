class Solution {
    static int findNth(int n){
        // code here
        int x=(n & -n);
        int ans=(int)(Math.log(x)/Math.log(2));
        return ans;
    }
}
