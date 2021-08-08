class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        long ans=0;
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++)
        {
            pq.add(arr[i]);
        }
        long cost=0;
        while(pq.size()>1)
        {
            long first=pq.poll();
            long second=pq.poll();
            ans=first+second;
            cost+=ans;
            pq.add(ans);
        }
        return cost;
    }
}
