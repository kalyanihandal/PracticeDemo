package Collection1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
	LinkedList l=new LinkedList();
    l.add("A");
    l.add("B");
    l.add("C");
    l.add("D");
    l.add("E");
    System.out.println(l);
    ListIterator itr=l.listIterator();
    while (itr.hasNext()) {
		String s = (String) itr.next();
		if (s.equals("B")) {
			itr.remove();
			
		} else if(s.equals("E")) {
            itr.add("F");
		} else if (s.equals("C")) {
			itr.set("K");
		}
			
		}
	System.out.println(l);
	}

}
