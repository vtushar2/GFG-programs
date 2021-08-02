class Solution
{
    int countSubstr (String S)
    {
        // your code here      
        char ans=' ';
        int count=0;
        int i=0;
        S=S.replaceAll("0","");
        while(i<S.length())
        {
            for(int j=i+1;j<S.length();j++)
            {
                count++;
            }
            i++;
        }
        return count;
    }
}
