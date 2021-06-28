class Solution {
    String firstAlphabet(String S) {
        // code here
        String res="";
        res=res+S.charAt(0);
        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            if(ch ==' ')
            {
                res+=S.charAt(i+1);
            }
        }
        return res;
    }
};
