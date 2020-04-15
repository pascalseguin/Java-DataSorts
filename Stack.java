
import java.util.*;
/**
 * Used to create and maintain the SLL. 
 * Created by Pascal Seguin Febuary 11, 2018.
 */
public class Stack<T extends Comparable<T>>extends SLL<T>
{
    // add an element data to the top of the stack.
    public void push( T data){ 
        addHead( data);
    }
    // remove an element from the top of the stack.
    public T pop()   {
        return deleteHead();
    }
    // return a pointer to the top element on the stack,
    // without removing it.
    public T peek()   {
        return get(0);
    }
    // return true if the stack is empty, false otherwise
    public boolean isEmpty()   {
        return size() == 0;
    }

    public void empty()
    {
        while (!isEmpty())
        {
            pop();
        }
    }
}


