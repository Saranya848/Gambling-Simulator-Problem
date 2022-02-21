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
		double n = Math.floor(Math.random() * 10) % 2;
		/*
		 * do one gambler's ruin simulation As a Calculative Gambler if won or lost 50%
		 * of the stake, would resign for the day
		 * 
		 */
		cash = (cash *100)/2;
		if (cash > 0) {
			if (n == 0) {
				cash--;
				System.out.println("Bet lost"); // $1 lost
			} else {

				cash++;
				System.out.println("Bet won"); // $1 won

			}
		}
		else {
			System.out.println("Resign the day");
		}
		System.out.println("Current cash is  " + cash);
		g.close();
	}

}
