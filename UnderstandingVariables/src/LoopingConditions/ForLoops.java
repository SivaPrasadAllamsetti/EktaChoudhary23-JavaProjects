package LoopingConditions;

import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {
//do-while: Where you want your statements to get executed atleast once
		//while and for --> where you want normal execution based on condition
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to multiply");
		int num = sc.nextInt();
		for(int i=10; i>0; i--) {
			System.out.println(num + " * " + i + " = " + num*i);
		}
		
	}

}
