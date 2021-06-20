class Solution{
    static String onesComplement(String S,int N){
        //code here
        String s="";
        for(int i=0;i<N;i++)
        {
            if(S.charAt(i)=='1')
            {
                s+=0;
            }
            else
            {
                s+=1;
            }
        }
        return s;
    }
}
