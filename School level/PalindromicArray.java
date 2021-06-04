class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  for(int i=0;i<n;i++)
                  {
                      StringBuilder s=new StringBuilder(String.valueOf(a[i]));
                      s.reverse();
                      String s1=new String(s.toString());
                      String s2=new String(String.valueOf(a[i]));
                      if(!s1.equals(s2))
                      {
                          return 0;
                      }
                  }
                  return 1;
           }
}
