package DataStructures.Lists.ImplementationOfDoubleLinkedList;
import DataStructures.Lists.ImplementationOfDoubleLinkedList.Employee;


public class DoubleLinkedLists {
    private NodeList head;
    private NodeList tail;
    private int size = 0;

    public NodeList getTail() {
        return tail;
    }

    public void setTail(NodeList tail) {
        this.tail = tail;
    }

    public NodeList getHead() {
        return head;
    }

    public void setHead(NodeList head) {
        this.head = head;
    }

    public void add(Employee employee){
        NodeList node = new NodeList(employee);
        node.setNext(head);
        if(!isEmpty()){
            head.setBefore(node);
        }else{
            tail = node;
        }
        head = node;
        size++;
    }

    public void addLast(Employee employee){
        if (isEmpty()){
            add(employee);
        }else{
            NodeList node = new NodeList(employee);
            tail.setNext(node);
            node.setBefore(tail);
            tail = node;
        }
        size++;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void printListReverse(){
        NodeList current = tail;
        while (current != null){
            System.out.println(current.getEmployee().toString());
            current = current.getBefore();
        }
        System.out.println("\n");
    }

    public void printList(){
        NodeList current = head;
        while (current != null){
            System.out.println(current.getEmployee().toString());
            current = current.getNext();
        }
        System.out.println("\n");
    }

    private void getLast(){
        NodeList aux = head;
        while(aux != null){
            setTail(aux);
            aux = aux.getNext();
        }
    }

    public NodeList popFirstNode(){
        if(isEmpty())
            return null;
        NodeList aux = head;
        aux.getNext().setBefore(null);
        head = aux.getNext();
        size--;
        return aux;
    }

    public int listSize(){
        return size;
    }

    public NodeList popFinal(){
        NodeList aux = tail;
        aux.getBefore().setNext(null);
        tail = aux.getBefore();
        size--;
        return aux;
    }
}
