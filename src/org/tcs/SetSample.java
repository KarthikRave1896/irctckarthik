package org.tcs;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;


public class SetSample {
	public static void main(String[] args) {
		Set ss=new HashSet();
		System.out.println(ss);
	
		ss.add("Karthik");
		ss.add(7871929231l);
		ss.add(26);
		ss.add('R');
		ss.add("karthik@gmail.com");
		ss.add(true);
		ss.add(87.7f);
		System.out.println(ss);
		
		Set si=new HashSet();
		si.add("Dog");
		si.add(99);
		si.add(641601);
		si.add("Money");
		si.addAll(ss);
		System.out.println(si);
		System.out.println("karthik");
		
		//si.retainAll(ss);
		//System.out.println(si);
		
		si.removeAll(ss);
		System.out.println(si);
		
	}

}
