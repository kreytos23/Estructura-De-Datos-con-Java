package DataStructures.Lists.ImplementationOfLinkedList.LinkedListInteger;

public class LinkedLists {
    private NodeList head;

    public NodeList getHead() {
        return head;
    }

    public void setHead(NodeList head) {
        this.head = head;
    }

    public void addSortedNumbers(int number){
        NodeList node = new NodeList(number);
        if(isEmpty()){
            node.setNext(head);
            head = node;
        }else{
            if(head.getNumber() > number){
                node.setNext(head);
                head = node;
                return;
            }
            NodeList aux = head;
            while(aux.getNext() != null){
                if(number < aux.getNext().getNumber()){
                    aux = aux.getNext();
                }else{
                    break;
                }
            }
            if (aux != null) {
                node.setNext(aux.getNext());
            }
            aux.setNext(node);
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void printList(){
        NodeList current = head;
        while (current != null){
            System.out.println(current.getNumber());
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
