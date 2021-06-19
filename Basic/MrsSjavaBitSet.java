class GfG{
    public void count(long n){
        // your code here.
        int count=0;
        int count1=0;
        while(n>0)
        {
            long s=n%2;
            if(s==0)
            {
                count++;
            }
            if(s==1)
            {
                count1++;
            }
            n=n/2;
        }
        System.out.println(count1+" "+count);
    }
}
