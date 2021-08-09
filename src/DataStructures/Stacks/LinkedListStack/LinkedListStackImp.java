package DataStructures.Stacks.LinkedListStack;

public class LinkedListStackImp {
    public static void main(String[] args) {

        LinkedListStack stack = new LinkedListStack();
        stack.push(new Employee("Manuel", "Victor", 4563));
        stack.push(new Employee("Luis", "Angel", 4514));
        stack.push(new Employee("Milos", "Pepe", 4263));
        stack.push(new Employee("Laura", "Bazaldua", 7863));
        stack.push(new Employee("Carlitos", "papa", 5263));
        stack.printStack();
        System.out.println(stack.pop());
        stack.printStack();
        System.out.println(stack.peek());
        stack.printStack();
    }
}
