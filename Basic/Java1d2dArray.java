class Complete
{
    public static ArrayList<Integer> array(int a[][], int b[], int n)
    {
        // Complete the function
        ArrayList<Integer> a1=new ArrayList<>();
        int leftdiagonal=0;
        for(int i=0;i<n;i++)
        {
            leftdiagonal+=a[i][i];
        }
        int max=b[0];
        for(int i=1;i<n;i++)
        {
            if(b[i]>max)
            {
                max=b[i];
            }
        }
        a1.add(leftdiagonal);
        a1.add(max);
        
        return a1;
    }
}
