class Solution
{
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        // code here
        ArrayList<Integer> a1=new ArrayList<>();
        int upper=0, lower=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i<=j)
                    upper+=matrix[i][j];
                if(i>=j)
                    lower+=matrix[i][j];
            }
        }
        a1.add(upper);
        a1.add(lower);
        return a1;
    }
}
