package varsAndExpressions;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if and switch and ternary operators
		
		int a = 300;
		int b = 500;
		int c = 700;
		
		
		/*
		 * if(a>b && a>c) { System.out.println("Value of a is greater"); }else if(b>a &&
		 * b>c) { System.out.println("Value of b is greater"); }else {
		 * System.out.println("Value of c is greater"); }
		 * 
		 * 
		 * System.out.println("I am out of the conditions");
		 */

		if(c==70) {
			System.out.println("the value of c is bdebffe");
			System.out.println("in the condition");
		}
		
		boolean result = a<b? true:false;
		System.out.println(result);
		
		int r = a<b && b<c ? a:b;
		System.out.println(r);
	}
	
	//if
	//if-elseif(1--n)
	//if-else
	//if-elseif-else

}
