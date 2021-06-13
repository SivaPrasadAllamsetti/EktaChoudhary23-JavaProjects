package LoopingConditions;

public class WhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Syntax of while
		/*
		 * while(condition) { //statements }
		 */
		//program to print 1 to 10
		//For any iterative loop, 3 things
		// initialization, condtion, manipulation operation
		int i = 1;
		while(i<=100 ) 
		{ 
			if(i%2==0) 
				System.out.println(i); 
			if(i > 97) {
				break;
			}
			System.out.println(i);
			i+=2; 
		}
		 
		
		
		/*
		 * while(i<=10 && i%2==0) { System.out.println(i); i++; }
		 */
		
		/*
		 * do { System.out.println(i); i++; }while(i%2 == 0);
		 */
		
	}

}
