/**
 * Created by xianggao on 16/1/22.
 * 237
 */
public class DeleteNodeinLinkedList {
    public void deleteNode(ListNode node) {
        //corner case
        if(node==null){
            return ;
        }
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
