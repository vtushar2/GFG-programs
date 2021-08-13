class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int carry=1;
        for(int i=N-1;i>=0;i--)
        {
            int temp=arr.get(i)+carry;
            list.add(temp%10);
            carry=temp/10;
        }
        if(carry!=0)
        {
            list.add(carry);
        }
        Collections.reverse(list);
        return list;
    }
};
