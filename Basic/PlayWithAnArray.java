class GfG
{
	public int[] formatArray(int[] a,int n)
        {
        // add code here.
        int k=0;
        for(int i=1;i<n;i+=2)
        {
            if(a[i]<a[i-1])
            {
                k=a[i];
                a[i]=a[i-1];
                a[i-1]=k;
            }
        }
        return a;
	}
}
