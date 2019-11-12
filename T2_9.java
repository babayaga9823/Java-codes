// 9. How to iterate through collection objects? Write a Program.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class T2_9
{
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        for (String ls : list) {
            System.out.println(ls);
        }
    }
}