import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList();
		// add data
		ll.add("hello");
		ll.add("hi");
		ll.add("abcd");
		ll.add("hjkl");
		// printing all the data
		System.out.println(ll);
		System.out.println("*****");
		// add at the first
		ll.addFirst("firs");
		// add at the last
		ll.addLast("fini");
		System.out.println(ll);
		System.out.println("*****");
// get method, to get values
		System.out.println(ll.get(0));
// set method, to set the value at that elements
		ll.set(0, "firsts");
		System.out.println(ll);
		System.out.println("****");
// to remove first and last element or an also remove from specific position using remove	
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
// how to print all the values of linkedlist.
//using for loop
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("***** ");
// suing advanced for loop
		for (String str : ll) {
			System.out.println(str);
		}
		System.out.println("*********");
// using iterator
		Iterator<String> ir = ll.iterator();
		while (ir.hasNext()) {
			System.out.println(ir.next());
		}
		System.out.println("*****");
//while loop
		int num = 0;
		while (ll.size() > num) {
			System.out.println(ll.get(num));
			num++;
		}

	}

}
