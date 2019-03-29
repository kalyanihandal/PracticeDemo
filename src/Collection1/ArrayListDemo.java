package Collection1;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList l=new ArrayList();
l.add("A");
l.add(3);
l.add(true);
l.add('a'); 
System.out.println(l);
l.remove(3);
System.out.println(l);
l.add(3, "third");
System.out.println(l);
l.add("AAAAA");
System.out.println(l);
l.remove(2);
System.out.println(l);
l.set(3, "kalyani");
System.out.println(l);
System.out.println(l.lastIndexOf(3));
	}

}
