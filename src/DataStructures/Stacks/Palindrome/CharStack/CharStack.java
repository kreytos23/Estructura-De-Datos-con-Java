package DataStructures.Stacks.Palindrome.CharStack;

import java.util.LinkedList;

public class CharStack {
    private LinkedList<Character> stack;

    public CharStack() {
        this.stack  = new LinkedList<>();
    }

    public void push(Character character){
       stack.push(character);
    }

    public boolean isEmpty(){
       return stack.size() == 0;
    }

    public Character pop(){
        return stack.pop();
    }

    public Character peek(){
        return stack.peek();
    }

    public void printStack(){
        for (Character character: stack) {
            System.out.print(character);
        }
        System.out.print("\n");
    }

    public int size(){
        return stack.size();
    }
}
