package DataStructures.Stacks.LinkedListStack;

public class LinkedListStack {

    private NodeList head;

    public void push(Employee employee){
        NodeList node = new NodeList(employee);
        node.setNext(head);
        head = node;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void printStack(){
        if(isEmpty())
            return;
        NodeList current = head;
        while (current != null){
            System.out.println(current.getEmployee().toString());
            current = current.getNext();
        }
    }

    public NodeList pop(){
        if(isEmpty())
            return null;
        NodeList aux = head;
        head = head.getNext();
        return aux;
    }

    public Employee peek(){
        if(isEmpty())
            return null;
        return head.getEmployee();
    }
}
