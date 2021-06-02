class Solution{
    static ArrayList<Integer> getTable(int N){
        // code here
        ArrayList a=new ArrayList();
        for(int i=1;i<=10;i++)
        {
            a.add(N*i);
        }
        return a;
    }
}
