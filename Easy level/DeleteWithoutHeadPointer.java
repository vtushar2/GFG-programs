class Solution
{
    void deleteNode(Node del)
    {
         // Your code here
         Node t=del.next;
         del.data=t.data;
         del.next=t.next;
    }
}

