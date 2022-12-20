import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {
	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		{
			hm.put(1, "hello");
			hm.put(2, "hi");
			hm.put(3, "kl");
			System.out.println(hm.get(1));

			// to print all values
			for (Entry m : hm.entrySet()) {
				System.out.println(m.getKey() + " " + m.getValue());
			}

			// to remove key and print remaining
			System.out.println(hm.remove(1));
			System.out.println(hm);
		}

		// to replace
		hm.replace(3, "jj");
		{
			System.out.println(hm);
		}
		System.out.println("****");
		HashMap<Integer, Employee1> emp1 = new HashMap<Integer, Employee1>();
		Employee1 a = new Employee1("tom", 94, "admi");
		Employee1 b = new Employee1("anil", 95, "cse");
		Employee1 c = new Employee1("ajay", 96, "seleni");
		Employee1 d = new Employee1("atul", 98, "ctp");
		emp1.put(1, a);
		emp1.put(2, b);
		emp1.put(3, c);
		emp1.put(4, d);

		// traverse
		for (Entry<Integer, Employee1> m1 : emp1.entrySet()) {
			int key = m1.getKey();
			Employee1 e1 = m1.getValue();
			System.out.println("the value" + key);
			System.out.println(e1.name + " " + e1.age + " " + e1.dept);
			System.out.println("********");
		}

	}
}
