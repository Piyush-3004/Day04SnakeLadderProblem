package com.blzAssgn;

import java.util.Random;
import java.util.Scanner;

public class SnakeLadder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int position=0;
		System.out.println("This is Start of game you are at position " + position);
		System.out.println("Enter 1 to roll the dice");

		Scanner sc = new Scanner(System.in);
		int op=sc.nextInt();
//		System.out.println("Enter 0 to skip dice rolling");
		
		Random random = new Random();

		while(position<100 ) {
		int diceRoll = 1+ random.nextInt(6);
			
		int op1 =  random.nextInt(2);

		
		if (op1==0) {
			if(position + diceRoll>100)
				position = position;
				else {
		position = position+ diceRoll;
		System.out.println(position);}
		}
		
		if(op1==1 && position !=0) {
			if (position-diceRoll<0)
				position=0;
				else {
		position=position-diceRoll;
		System.out.println(position);
				}
		}
		
		}
	}
}