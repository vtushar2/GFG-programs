class Solution
{
	int getLevelDiff(Node root)
	{
	    //code here
	    if(root==null)
	    {
	        return 0;
	    }
	    int rootl=getLevelDiff(root.left);
	    int rootr=getLevelDiff(root.right);
	    
	    return root.data-(rootl+rootr);
	}
}
