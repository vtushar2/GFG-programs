class Solution
{
    //Function to find maximum number of consecutive steps 
    //to gain an increase in altitude with each step.
    static int maxStep(int A[], int N)
    {
        // Your code here
        int curr_step=0, max_step=0;
        for(int i=1;i<N;i++)
        {
            if(A[i]>A[i-1])
            {
                curr_step++;
                max_step=Math.max(max_step,curr_step);
            }
            else
            {
                curr_step=0;
            }
        }
        return max_step;
    }
    
}
