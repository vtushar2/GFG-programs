class Tree
{
    int leaves=0;
    void findLeaves(Node root)
    {
        if(root!=null)
        {
            if(root.left==null && root.right==null)
            {
                this.leaves++;
            }
            findLeaves(root.left);
            findLeaves(root.right);
        }
    }
    int countLeaves(Node node) 
    {
         // Your code  
         findLeaves(node);
         return this.leaves;
    }
}
