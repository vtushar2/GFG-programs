class Tree
{
    //Function to find the minimum element in the given BST.
    int minValue(Node node)
    {
        Node curr=node;
        if(node==null)
        {
            return -1;
        }
        while(curr.left!=null)
        {
            curr=curr.left;
        }
        return curr.data;
    }
}
