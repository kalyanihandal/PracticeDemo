package Collection1;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList l=new LinkedList();
l.add("Kalyani");
l.add(12);
l.add(null);
l.add(true);
l.add('a');
System.out.println(l);
l.set(4, "Handal");
System.out.println(l);
l.add(1, "KKKKKk");
System.out.println(l);
l.removeLast();
l.addFirst("Kalluuu");
System.out.println(l);
l.addLast("Handal");
System.out.println(l);
	}

}
