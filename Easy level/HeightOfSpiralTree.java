class Tree
{
    // Return the height of the given special binary tree
    public static int findTreeHeight(Node root)
        {
            // code here.
            if(root==null)
            {
                return 0;
            }
            if(root.right!=null && root.right.left==root)
            {
                return 1;
            }
            return 1+Math.max(findTreeHeight(root.left),findTreeHeight(root.right));
        }
}
