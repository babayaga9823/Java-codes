import java.util.*;
class prog68 
{
    public static void main(String[] args) 
    {
        LinkedList<Integer> linkedli = new LinkedList<Integer>();
        linkedli.add(new Integer(1));
        linkedli.add(new Integer(2));
        linkedli.add(new Integer(3));
        linkedli.add(new Integer(4));
        linkedli.add(new Integer(5));
        System.out.print("Elements before reversing: " + linkedli);
        Collections.reverse(linkedli);
        System.out.print("\nElements after reversing: " + linkedli);
    }
}