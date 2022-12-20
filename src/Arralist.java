// testing array list
import java.util.ArrayList;
import java.util.Iterator;

public class Arralist {
// non generic, allow all the data
	ArrayList ar= new ArrayList();{
	ar.add(100);
	ar.add(200);
	ar.add(300);
	ar.add(400);
	ar.add("Tom");
	ar.add("hello");
	}
	//adding generics, i.e. it allows specific values only i.e. integers.
	ArrayList<Integer>ar1= new ArrayList<Integer>();{
	ar1.add(800);
	ar1.add(900);
	ar1.add(600);
	ar1.add(500);
	}
	// ading generics
	ArrayList<String>ar2= new ArrayList<String>(); {
	ar2.add("hi");
	ar2.add("ghjk");
	ar2.add("kljh");
	ar2.add("bnhg");
	
		
		
	
	}
	
	public static void main(String[] args) {
		Arralist a= new Arralist();
		System.out.println(a.ar.size());
		System.out.println(a.ar.get(4));
		System.out.println(a.ar1.get(1));
		System.out.println(a.ar2.get(2));
		System.out.println(a.ar.get(1));
		

	
Employee e1= new Employee("chai",28,"cs");
Employee e2= new Employee("tom", 27,"hg");
Employee e3= new Employee("peter",29,"jk");


//creating arraylist for objects
ArrayList<Employee> ar3= new ArrayList<Employee>();
System.out.println(ar3.add(e1));
System.out.println(ar3.add(e2));
System.out.println(ar3.add(e3));

//iterator to traverse values, to print all the values of the employee object here
Iterator<Employee> it= ar3.iterator();
while(it.hasNext()) {
	Employee emp= it.next();
	System.out.println(emp.name+" "+emp.age+" "+emp.dept);}
    //System.out.println(emp.name);
	//System.out.println(emp.age);
	//System.out.println(emp.dept);}

System.out.println("********");

// to add all the array list, let us create new arry list here and add it to previous ar2 list now
ArrayList<String>ar4= new ArrayList<String>();
ar4.add("abcd");
ar4.add("hello");
ar4.add("hi");

a.ar2.addAll(ar4);
for(int i=0;i<a.ar2.size();i++) {
	System.out.println(a.ar2.get(i));}

	System.out.println("**********");


// similarly to remove here
a.ar2.removeAll(ar4);
for(int i=0;i<a.ar2.size();i++) {
	System.out.println(a.ar2.get(i));
}
System.out.println("***********************");
	

// to print the common element from two arraylist, we use retain all
ArrayList<String>ar5= new ArrayList<String>();
ar5.add("abcd");
ar5.add("hello");
ar5.add("hi");

ArrayList<String>ar6= new ArrayList<String>(); {
	ar6.add("hi");
	ar6.add("ghjk");
	ar6.add("kljh");
	ar6.add("bnhg");

	ar5.retainAll(ar6);

for(int i=0;i<ar5.size();i++) {
	System.out.println(ar5.get(i));
}
System.out.println("*********");

a.ar2.retainAll(ar4);
for(int i=0;i<a.ar2.size();i++) {
	System.out.println(a.ar2.get(i));
}


}}}
