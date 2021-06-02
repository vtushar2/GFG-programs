class Solution {
    static int[] getAreas(int L , int W , int B , int H , int R) {
        // code here
        int arr[]=new int[3];
        arr[0]=L*W;
        arr[1]=(int)(0.5*B*H);
        arr[2]=(int)(3.14*(R*R));
        
        return arr;
    }
};
