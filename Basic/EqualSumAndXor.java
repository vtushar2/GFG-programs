class GfG{
       /*you are required to complete this method */
	public int countValues(int n)
	{
            //Your code here
            int count=0;
            for(int i=0;i<=n;i++)
            {
                if((n+i)==(n^i))
                {
                    count++;
                }
            }
            return count;
	}
}
