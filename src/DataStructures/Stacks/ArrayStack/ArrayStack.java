package DataStructures.Stacks.ArrayStack;

public class ArrayStack {
    private Employee[] stack;
    private int top;

    public ArrayStack(int size) {
        this.stack = new Employee[size];
        top = 0;
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public void push(Employee employee){
        if(top == stack.length){
            Employee[] newStack = new Employee[stack.length * 2];
            System.arraycopy(stack,0, newStack, 0, stack.length);
            stack = newStack;
        }
        stack[top++] = employee;
    }

    public Employee pop(){
        if(isEmpty()){
            throw new ArrayStoreException();
        }
        Employee popEmployee = stack[--top];
        stack[top] = null;
        return popEmployee;
    }

    public Employee peek(){
        if(isEmpty()){
            throw new ArrayStoreException();
        }
        return stack[top - 1];
    }

    public void printStack(){
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
