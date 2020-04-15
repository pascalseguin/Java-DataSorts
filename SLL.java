import java.util.*;
/**
 * Used to create and maintain the SLL. 
 * Created by Pascal Seguin Febuary 11, 2018.
 */
public class SLL<T extends Comparable<T>>
{
    Node<T> head, tail; 

    /**
     * Adds the takin in data in the order dictated by the passsed in Comparator to the SLL. Also converts them to Nodes.
     */
    public void addFreq(T n, Comparator<T> compare)
    {
        Node<T> node = new Node<T>(n);
        if (head == null) {
            head = node; 
        } 
        else {
            if ( compare.compare(node.getData(), head.getData()) <= 0) // less than first item, insert here. 
                addHead(node);
            else 
            {
                Node<T> curr = head;
                while (curr.getNext() != null && compare.compare(node.getData(), curr.getNext().getData()) > 0) 
                {
                    curr = curr.getNext();
                }
                if (curr.getNext() == null) // did not find a place 
                {
                    curr.setNext(node);
                }
                else 
                {
                    node.setNext(curr.getNext());
                    curr.setNext(node);
                }

            }
        }
    }

    /**
     * Empties the to all for new information to be added.
     */
    public void emptyList()
    {
        head = null;
    }

    /**
     * Orders the created nodes based on the tocompare metheod of ordering. Gives the order for the nodes to be added in.
     */
    public void addInOrder(T n) 
    {
        Node<T> node = new Node<T>(n);
        if (head == null) {
            head = node; 
        } 
        else {
            if ( (node.getData().compareTo( head.getData())) <= 0) // less than first item, insert here. 
                addHead(node);
            else 
            {
                Node<T> curr = head;
                while (curr.getNext() != null && (node.getData().compareTo(curr.getNext().getData())) > 0) 
                {
                    curr = curr.getNext();
                }
                if (curr.getNext() == null) // did not find a place 
                {
                    addTail(node);
                }
                else 
                {
                    node.setNext(curr.getNext());
                    curr.setNext(node);
                }

            }
        }
    }

    /**
     * Adds the selected node to the front of the SLL.
     */   
    public void addHead( Node<T> n) 
    {
        if (head == null)  
        {
            head = n;
        }
        else 
        {
            n.setNext(head);
            head = n;
        }
    }

    /**
     * Returns the size of the SLL.
     */
    public int size()
    {
        Node<T> curr = head;
        int i = 0;
        while(curr != null)
        {
            i++;
            curr = curr.getNext();
        }
        return i;
    }

    /**
     * Checks the SLL for the word that matches the passed in data.
     */
    public boolean contains(Word w)
    {
        return indexOf(w) != -1;
    }

    /**
     * Checks the SLL for the matching word data and returns the index of the node that contains it.
     * Or returns flag if node is not in the SLL.
     */
    public int indexOf(Word w)
    {
        Node<T> curr = head;
        int i = 0;
        while (curr != null)
        {
            if (curr.getData().equals(w))
            {
                return i;
            }
            i++;
            curr = curr.getNext();
        }
        return -1;
    }
    /**
     * Gets/returns the data of the node at the passed in location.
     */
    public T get(int i)
    {
        Node<T> curr = head;
        int count = 0;
        int length = size();
        T data = null;
        if (i <= length && i >= 0)
        {
            while (count < i)
            {
                curr = curr.getNext();
                count++;
            }
            data = curr.getData();
        }
        return data;
    }
    /**
     * Adds the passed in node to the end of its respective SLL.
     */
    public void addTail(Node<T> data)
    {

        if (head == null)
        {
            head = data;
        }
        else
        {
            Node<T> curr = head;
            while(curr.getNext() != null)
            {
                curr = curr.getNext();

            }
            curr.setNext(data);
        }
    }
}
