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
        node.setBefore(head.getBefore());
        if(!isEmpty())
            head.setBefore(node);
        head = node;
        size++;
    }

    /*public void addLast(Employee employee){
        if (isEmpty()){
            add(employee);
        }else{
            getLast();
            NodeList node = new NodeList(employee);
            node.setBefore(tail);
            tail.setNext(node);
            tail = node;
        }
    }*/

    public void addLast(Employee employee){
        if (isEmpty()){
            add(employee);
        }else{

        }

    }

    public boolean isEmpty(){
        return head == null;
    }

    public void printListReverse(){
        NodeList current = head;
        getTail();
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
        head = head.getNext();
        return aux;
    }
}
