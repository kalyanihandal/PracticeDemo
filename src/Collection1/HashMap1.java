package Collection1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap hm=new HashMap();
hm.put(1,"Kalyani");
hm.put(2,"bbbb");
hm.put(3,"cccc");
hm.put(4,"ddddd");
hm.put(10,"eeee");
Set entry=hm.entrySet();
System.out.println();
System.out.println(hm);
Set s=hm.keySet();
Iterator itr=s.iterator();
while(itr.hasNext()){
	System.out.println(hm.get(itr.next()));
	
}
	}
}
