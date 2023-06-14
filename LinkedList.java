package DSA;
public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    //Inserting value on the starting of the linked list
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    //Inserting value on the last of the linked list
    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    //Inserting value on the particular index of the linked list
    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = new Node(val);
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    //deleting value from the last of the linked list
    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    //deleting value from the last of the linked list
    public int deletelast() {
        if (size <= 1) {
            deleteFirst();
        }
        Node node = get(size - 2);
        int val = tail.value;
        tail = node;
        tail.next = null;
        size--;
        return val;
    }

    //deleting value from the particular index of the linked list
    public int delete(int index){
        if (index==0){
            deleteFirst();
        }
        if (index==size-1){
            deletelast();
        }
        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        size--;
        return val;
    }

    //    finding node in a linked list by its index
    public Node get(int index){
        Node node=head;
        for (int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

//    finding node in a linked list by its value
    public Node find(int value){
        Node node=head;
        while (node!=null){
            if (node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }


//    displaying all values of the given linked list
    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("end");

    }
    //    creating node
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        LinkedList first = new LinkedList();
        LinkedList second = new LinkedList();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        first.display();

    }


}
