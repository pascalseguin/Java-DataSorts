
public class Queue<T extends Comparable<T>> extends SLL<T>
{
    // add an element data to the tail of the queue.
    public void enqueue( T data)
    { 
        addTail( data);
    }

    // remove an element from the head of the queue.
    public T dequeue()
    {
        return deleteHead();
    }

    // return a pointer to the top element on the queue,
    // without removing it.
    public T peek()
    {
        return get(0);
    }

    // return true if the queue is empty, false otherwise
    public boolean isEmpty()
    {
        return size() == 0;
    }

    public void empty()
    {
        while (!isEmpty())
        {
            deleteHead();
        }
    }

}
