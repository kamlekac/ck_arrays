
public class ConstructorWithSuperKeyword extends B {

	// inside the constructor, we need to have only one super keyword, there can not
	// be more than one super keyword inside constructor, hence create another
	// constructors, as the super keyword should be first in constructor.
	ConstructorWithSuperKeyword() {
		super();
		// System.out.println("child cont");
		System.out.println("******");
	}

	ConstructorWithSuperKeyword(int i) {
		super(i);
		// System.out.println("the value of i "+i);
		System.out.println("******");
	}

	ConstructorWithSuperKeyword(int i, int j) {
		super(i, j);
		// System.out.println("the value of i "+i);
		// System.out.println("the value of j "+j);
		System.out.println("*******");
	}

// command+shift+f for formatting the code and	
	public static void main(String[] args) {
		ConstructorWithSuperKeyword c1 = new ConstructorWithSuperKeyword();
		ConstructorWithSuperKeyword c2 = new ConstructorWithSuperKeyword(10);
		ConstructorWithSuperKeyword c3 = new ConstructorWithSuperKeyword(10, 20);
	}

}
