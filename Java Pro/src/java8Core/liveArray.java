package java8Core;

public class liveArray {

	public static void main(String[] args) {
		int a[]= {12,45};
		int []a1= {12,45};
		int[] a2= {12,45};
		int [] a3= {12,45};
		int a4 []= {12,45};
		int []a5[]= {{12,45},{5,8}};
		int a6 [][]= {{12,45},{5,8}};
		int[][]a7= {{12,45},{5,8}};
		
		System.out.println(a[1]);
		System.out.println(a1[1]);
		System.out.println(a2[1]);
		System.out.println(a3[1]);
		System.out.println(a4[1]);
		System.out.println(a5[1][1]);
		System.out.println(a6[1][1]);
		System.out.println(a7[1][1]);


	}

}
