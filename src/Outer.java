import java.util.Random;

/*class Demo{
	static void m1() {
		System.out.println("hello");
	}
	
	static class Inner{
		static void method2() {
			System.out.println("method");
		}
*/

public class Outer {
	
	/*public static void main(String[] args) {
		Demo d= new Demo();
		d.m1();
		Demo.Inner in= new Demo.Inner();
		in.method2();
	}*/
	public static void main(String[] args) {
		/*for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				if(j%2==1) {
					System.out.print("1");}
				else
					System.out.print("0");}
			System.out.println(" ");
				}
			}
		}*/
		/*int []a= {1,2,3,4};
		for(int i:a) {
			System.out.println(i);
		}}*/
		
		/*int d [][]= {
				{1,2,3,4},
				{4,5,6,7},
				{6,7,8,9}
				};
			for(int i=0;i<3;i++) {
				for(int j=0;j<4;j++) {
				System.out.print(" " +d[i][j]);
			}
	            System.out.println(" ");}}}
	            */
		int a[][]= {{1,2,3,4},
		
		            {1,2,3,4}};
		
		
		int b[][]= {{1,2,3,4},
				    {1,2,3,4}
		                      };
		int c[][];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]);}
			System.out.println("");}
				System.out.println("============");
			for(int k=0;k<b.length;k++) {
				for(int j=0;j<b[k].length;j++) {
					System.out.print(b[k][j]);
				}
				System.out.println("");
				
			
			System.out.println(a[i][j]+b[k][j]);
			
		}
		
	}}
		
		
	
	