package Collections;

import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {

		TreeMap t=new TreeMap<>();
		t.put("XXX",10);
		t.put("YYY",11);
		t.put("ZZZ",13);
		t.put("MMM",14);
		t.put("JJJ",15);
		t.put("KKK",16);
		t.put("LLL",19);
		System.out.println(t);
	}
	
	public int compare(Object obj1,Object obj2) {
		
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
		
	}

}
