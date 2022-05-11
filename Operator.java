package AssignmentInterface;

public class Operator implements  OperatorInterface {
	
	int a = 5;
	int b = 7;
	int c=12;
	
public double Arithmetic() {
	
//	return a+b;
	System.out.println("ADDITION OF TWO NUMBER" +  (a+b));
	return a+b;
	
}
	
	public boolean Comparison() {
		System.out.println( a>b);
		return a>b;
	}
	public boolean logical() {
		System.out.println((a<b) && (b>c));
		return(a<b) && (b>c);
	}
	public double IncrementDecrement () {
		System.out.println(" increment operator"+ ++a);
		return a++;
	}
	public double BitWise() {
//		System.out.println( a|b);
		return  a| b;
	}

}
