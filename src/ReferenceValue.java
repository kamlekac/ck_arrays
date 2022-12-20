
public class ReferenceValue {
 int g=10;
 int h=20;
	public static void main(String[] args) {
		ReferenceValue v= new ReferenceValue();
		int x=10;
		int y=20;
		
		System.out.println(v.add(90, 92));// call by value
		v.swap(v);
		System.out.println(v.g);//call by reference
		System.out.println(v.h);// call by reference
		
}
        
	// call by value
	public int add(int p, int q) {
		int a=40; int b=60;
		int c=p+q;
		return c;
	}
	// call by reference
	public void swap(ReferenceValue t) {
		     int temp=t.g;// temp =10
		     t.g= t.h; //g=20
		     t.h= temp;//h=10
	}
	
	
	
}
