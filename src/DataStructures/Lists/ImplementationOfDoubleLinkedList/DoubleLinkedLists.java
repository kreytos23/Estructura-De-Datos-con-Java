package DataStructures.Lists.ImplementationOfDoubleLinkedList;

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

    public void addInter(Employee employee,int index){
        if (isEmpty()){
            add(employee);
        }else if(index > 0 && index < size){
            NodeList node = new NodeList(employee);
            NodeList prev = head;
            for (int i = 0; i < index-1; i++) {
                prev = prev.getNext();
            }
            prev.getNext().setBefore(node);
            node.setNext(prev.getNext());
            node.setBefore(prev);
            prev.setNext(node);
            size++;
        }else{
            System.out.println("No sea tonto");
        }
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
        if(isEmpty())
            return null;
        NodeList aux = tail;
        aux.getBefore().setNext(null);
        tail = aux.getBefore();
        size--;
        return aux;
    }

    public NodeList popInter(int index){
        if (isEmpty()){
            return null;
        }else if(index > 0 && index < size){
            NodeList prev = head;
            for (int i = 0; i < index-1; i++) {
                prev = prev.getNext();
            }
            NodeList deleted = prev.getNext();
            prev.setNext(prev.getNext().getNext());
            prev.getNext().getNext().setBefore(prev);
            size--;
            return deleted;
        }else{
            System.out.println("No sea tonto");
            return null;
        }
    }
}
