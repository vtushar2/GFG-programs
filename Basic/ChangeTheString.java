class Solution{
    String modify(String s){
        String S="";
        if(s.charAt(0)>='a' && s.charAt(0)<='z')
        {
            S=s.toLowerCase();
        }
        else
        {
            S=s.toUpperCase();
        }
        return S;
    }
}
