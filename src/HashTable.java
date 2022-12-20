import java.util.Hashtable;

public class HashTable {

	/*Hashtable h= new Hashtable(); {
	h.put('A', 100);
	h.put('B', 200);
	h.put('C', 300);
	h.put('D', 400);
		System.out.println(h.get('C'));
		System.out.println(h.size());
			}*/
		
	/*Hashtable <Integer,Integer> h1= new Hashtable<Integer, Integer> ();{
	h1.put(0, 100);
	h1.put(1, 200);
	h1.put(2, 300);
	h1.put(3, 400);
	h1.put(4, 500);
	h1.put(5, 600);
	h1.put(6, 700);
	h1.put(7, 800);
	System.out.println(h1.size());
	}*/
	
	Hashtable<Double, Double>h2= new Hashtable<Double, Double> ();{
		h2.put(0.0, 10.1);
		h2.put(0.1, 10.2);
		h2.put(0.2, 10.3);
		h2.put(0.3, 10.4);
		h2.put(0.6, 10.0);
		h2.put(0.4, 10.5);
		h2.put(0.5, 10.6);
		h2.put(0.8, 10.8);
		System.out.println(h2.size());
		System.out.println(h2.get(0.2));
		System.out.println(h2.get(0.3));
	}
	
	public static void main(String[] args) {
		HashTable b= new HashTable();
        // b.h.put("Hello", 90);
        // System.out.println(b.h.get("Hello"));
        // System.out.println(b.h.get('A'));
        // System.out.println(b.h1.size());
         
	}

}
