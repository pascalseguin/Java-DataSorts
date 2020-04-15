import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * Write a description of class A3a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class A3a 
{
    Stack<Character> stack = new Stack<Character>();
    Stack<Character> stackrev = new Stack<Character>();
    private BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
    
    
    
    public static void main(String[]args)
    {
        A3a run = new A3a();
        run.proccessing();
    }

    public void proccessing ()
    {
        add();
        printStack();
    }
    
    public void add()
    {
        while ( inp.read() != -1)
        {
            int c = inp.read();
            if (check(c))
            {
                char add = (char) c;
                stack.push(add);
            }
            
        }
        
    }
    
    public boolean check(int c)
    {
        if (c == 9 && c == 10 && c == 11 && c == 12 && c == 13 && c ==32)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public void printStack()
    {
        
    }
}
