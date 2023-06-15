package DSA;
class RemoveDuplicates {

    public ListNode duplicate(ListNode node) {
        ListNode head = node;
        while (node.next != null) {
            if (node.value==node.next.value){
                node.next=node.next.next;
            }
            else {
                node=node.next;
            }
        }
        return head;
    }

    private class ListNode {
        int value;
        ListNode next;
        ListNode(){};

        ListNode(int value) {
            this.value = value;
        }

        ListNode(int value,ListNode next) {
            this.value = value;
            this.next = next;
        }
    }
}
