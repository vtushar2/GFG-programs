class Solution{
    static List<Integer> goals(int X, int Y, int Z)
    {
        // code here
        ArrayList<Integer> a1=new ArrayList<Integer>();
        int g=0,n=0;
        while(Z!=1)
        {
            if((X%Z)==0 && (Y%Z)==0)
            {
                g++;
                X--;
            }
            else if((X%Z)==0)
            {
                g++;
                X--;
            }
            else if((Y%Z)==0)
            {
                n++;
                Y--;
            }
            else
            {
                Z--;
            }
        }
        a1.add(g);
        a1.add(n);
        return a1;
    }
}
