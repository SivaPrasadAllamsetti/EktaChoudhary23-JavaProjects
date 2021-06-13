package LoopingConditions;

public class LoopingStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// It keeps iterating certain set of statements till my boolean expression holds true
		//make sure that you have some value changing operations in place
		
		//while, do-while, for
		int i=10;
		
		
		//It iterates atleast once
		//It dfirst executes the statements and then evaluates the condition
		do {
			System.out.println(i);
			i--;
		}while(i>0);
		
		/*
		 * do { //statements }while(boolean condition)
		 */
		System.out.println(i);
	}

}
