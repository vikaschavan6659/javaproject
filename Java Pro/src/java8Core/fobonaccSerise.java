package java8Core;

public class fobonaccSerise {

	public static void main(String[] args) {
		int a=0, b=1,i ,n=100,c;
		System.out.print(a+""+b);
		for( i=1;i<n;i++) {
			 c=a+b;
			if(c<=100) {
				System.out.println(c);
				a=b;
				b=c;
			}
			}
		
	}

}
