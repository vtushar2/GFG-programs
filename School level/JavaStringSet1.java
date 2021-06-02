class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
        StringBuilder str=new StringBuilder();
        str.append(S1+S2);
        return new String(str.reverse());   // StringBuilder converted into String again
    }
}
