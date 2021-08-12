class Solution {
    int isKaprekar(int N) {
        // code here
        if(N==0 || N==1)
        {
            return N;
        }
        int p=(int)(Math.pow(N,2));
        int d=0,c=0;
        while(p>0)
        {
            d=(int)((p%10)*Math.pow(10,c)+d);
            c++;
            p=p/10;
            if((p+d)==N && d!=0 && p!=0)
            {
                return 1;
            }
        }
        return 0;
    }
}
