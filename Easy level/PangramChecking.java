class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String str)
    {
        // your code here
        String s=str.toLowerCase();
        for(char i='a';i<='z';i++)
        {
            if(s.indexOf(i)==-1)
            {
                return false;
            }
        }
        return true;
    }
}
