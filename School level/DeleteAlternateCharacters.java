class Solution {
    static String delAlternate(String S) {
        // code here
        String str="";
        for(int i=0;i<S.length();i++)
        {
            if(i%2==0)
            {
                str+=S.charAt(i);
            }
        }
        return str;
    }
}
