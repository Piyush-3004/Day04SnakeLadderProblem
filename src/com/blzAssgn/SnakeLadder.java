package com.blzAssgn;

import java.util.Random;
import java.util.Scanner;

public class SnakeLadder {

	public static void main(String[] args) {

		int position = 0;
		System.out.println("This is Start of game you are at position " + position);
		System.out.println("Enter 1 to roll the dice");

		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();
//		System.out.println("Enter 0 to skip dice rolling");

		Random random = new Random();
		int diceRoll = 1 + random.nextInt(6);

		System.out.println(diceRoll);

	}
}