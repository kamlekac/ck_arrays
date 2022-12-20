
public class Constructor {
int i; float f;
    public Constructor() {
			System.out.println(f+i);
	}
	 Constructor(int k){
		 i=k;
		 System.out.println(i);
	 }
	 Constructor(int k, int h){
		 System.out.println(k+h);
	 }
    public int Constructor1(int n, double d){
	       int y=n;
		    int j=(int)d;
		   int a=y+j;
	    System.out.println(y);
		System.out.println(a);
		return a;
    }
	 Constructor(int m, double n){	
		 int s= (int)n;
		 double g= m;
		 int gg=(int)n;
		 System.out.println(gg);
	 }
	public static void main(String[] args) {
		Constructor c= new Constructor(8);
	
		Constructor c1= new Constructor(6,8);
		Constructor c2= new Constructor(4,4.4);
		 //c.Constructor1(4, 8);
		 
	}}	
	