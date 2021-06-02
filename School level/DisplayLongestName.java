class GFG {
    String longest(String names[], int n) {
        int count=0;
        int pos=0;
        for(int i=0;i<n;i++)
        {
            int current = names[i].length();
            if(current>count)
            {
                count=current;
                pos=i;
            }
        }
        return names[pos];
        
    }
}
