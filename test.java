package variables;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class test {

	public static void main(String[] args) {
		//ArrayList al= new ArrayList(); 
		//LinkedList al= new LinkedList(); 
		Vector al= new Vector(); 
		//Stack al= new Stack(); 
		System.out.println(al.capacity());
		System.out.println(al.size());
		al.add(34);//
		al.add(new Integer(34));//autoboxing: converting prim to obj 
		al.add(30); 
		al.add("sathya"); 
		al.add("soma"); 
		al.add(null); 
		al.add(true); 
		al.add('d'); 
		al.add(90.9); 
		al.add("sathya");
		al.add(90.9);
		System.out.println(al.capacity());
		System.out.println(al.size());

	}

}
