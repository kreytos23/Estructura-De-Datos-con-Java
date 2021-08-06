package DataStructures.Lists.ImplementationOfDoubleLinkedList;

public class NodeList {
    private Employee employee;
    private NodeList next;
    private NodeList before;

    public NodeList getBefore() {
        return before;
    }

    public void setBefore(NodeList before) {
        this.before = before;
    }

    public NodeList(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public NodeList getNext() {
        return next;
    }

    public void setNext(NodeList next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}
