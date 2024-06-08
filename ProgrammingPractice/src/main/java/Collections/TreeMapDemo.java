package Collections;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap t=new TreeMap<>();
		t.put(100,"ZZZ");
		t.put(103,"YYY");
		t.put(101,"XXX");
		t.put(104,106);
		t.put(107,null);
		//t.put("MMM","JJJ");//classCastException
		//t.put(null,"xxx");//NullpointerException
		System.out.println(t);
	}

}
