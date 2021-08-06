package DataStructures.Lists.ImplementationOfLinkedList;

public class LinkedLists {
    private NodeList head;

    public NodeList getHead() {
        return head;
    }

    public void setHead(NodeList head) {
        this.head = head;
    }

    public void add(Employee employee){
        NodeList node = new NodeList(employee);
        node.setNext(head);
        head = node;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void printList(){
        NodeList current = head;
        while (current != null){
            System.out.println(current.getEmployee().toString());
            current = current.getNext();
        }
    }

    public NodeList popFirstNode(){
        if(isEmpty())
            return null;
        NodeList aux = head;
        head = head.getNext();
        return aux;
    }
}
