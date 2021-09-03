class Solution
{
    int max_Books(int a[], int n, int k)
    {
         // Your code here  
         int s=0,max=0;
         for(int i=0;i<n;i++)
         {
             if(a[i]<=k)
             {
                 s+=a[i];
                 if(s>max)
                 {
                     max=s;
                 }
             }
             else
             {
                 s=0;
             }
         }
         return max;
    }
}
