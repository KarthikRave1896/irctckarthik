package org.tcs;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;

public class SetSample2 {
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

	
	Set as=new LinkedHashSet();
	as.add("Dog");
	as.add(99);
	as.add(641601);
	as.add("Money");
	as.addAll(ss);
	System.out.println(as);
	}

}

