class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> arr=new ArrayList<Integer>();
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
       if(root!=null)
       {
           postOrder(root.left);
           postOrder(root.right);
           arr.add(root.data);
       }
       return arr;
    }
}
