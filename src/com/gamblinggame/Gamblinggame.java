package com.gamblinggame;

import java.util.*;

public class Gamblinggame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner g = new Scanner(System.in);
		/*
		 * Entering User inputs for stack and bet
		 */
		System.out.println("Enter stack of every day");
		int stack = g.nextInt();
		System.out.println("Enter bet of every day");
		int bet = g.nextInt();
		int cash = stack;
		/*
		 * random number
		 */
		double n = Math.floor(Math.random() * 10) % 3;
		/*
		 * do one gambler's ruin simulation
		 */
		if (n == 0) {
			cash--;
			System.out.println("Bet lost"); // $1 lost
		} else {

			cash++;
			System.out.println("Bet won"); // $1 won

		}
		System.out.println("Current cash is  " + cash);
		g.close();
	}

}
