class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        char[] c1=a.toCharArray();
        char[] c2=b.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String s1=String.valueOf(c1);
        String s2=String.valueOf(c2);
        if(s1.equals(s2))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
