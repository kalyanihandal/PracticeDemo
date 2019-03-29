package Collection1;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector v=new Vector();
v.add("Kalyani");
v.add(0);
v.add(null);
v.add(false);
v.add('z');
System.out.println(v);
v.addElement("Handal");
System.out.println(v);
v.removeElementAt(3);
System.out.println(v);
//v.removeAllElements();
System.out.println(v);
System.out.println(v.capacity());
System.out.println(v.get(2));


	}

}
