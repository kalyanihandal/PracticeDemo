package Collection1;
import java.util.*;
public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put(91,"India");
		hm.put(92,"Pak");
		hm.put(1,"London");
		hm.put(3,"USA");
		hm.put(4,"Australia");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Country Code: ");
		Integer keys=input.nextInt();
		System.out.println(hm.get(keys));
	}

}
