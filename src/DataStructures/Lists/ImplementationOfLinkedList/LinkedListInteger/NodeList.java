package DataStructures.Lists.ImplementationOfLinkedList.LinkedListInteger;

import DataStructures.Lists.ImplementationOfLinkedList.Employee;

public class NodeList {
    private int number;
    private NodeList next;

    public NodeList(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public NodeList getNext() {
        return next;
    }

    public void setNext(NodeList next) {
        this.next = next;
    }

}
