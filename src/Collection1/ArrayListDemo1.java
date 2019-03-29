package Collection1;

import java.io.*;
import java.util.*;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList l=new ArrayList();
l.add(11);
l.add(7);
l.add(78);
l.add(12);
l.add(11);
System.out.println(l);
List l1=Collections.synchronizedList(l);
System.out.println(l1);
	}

}
