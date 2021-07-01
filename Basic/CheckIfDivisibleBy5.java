class Solution{
    static int divisibleBy5(String N){
        // code here
        int i=N.length()-1;
        char a=N.charAt(i);
        if(a=='0' || a=='5')
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
