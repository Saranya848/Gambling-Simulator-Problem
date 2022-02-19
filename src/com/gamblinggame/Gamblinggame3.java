package com.gamblinggame;

import java.util.Scanner;

public class Gamblinggame3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner g = new Scanner(System.in);
		/*
		 * Entering User inputs for stack and bet
		 */
		System.out.println("Enter stack of every day");
		int stake = g.nextInt();
		System.out.println("Enter bet of every day");
		int bet = g.nextInt();
		int cash = stake;
		/*
		 * do one gambler's ruin simulation As a Calculative Gambler if won or lost 50%
		 * of the stake, would resign for the day
		 * 
		 */
		double n = Math.floor(Math.random() * 10) % 2;
		//determining 50% results
		int result = cash + 50 % cash;
		int result1 = cash - 50 % cash;
		while(cash < result && cash > result1) {
				if (n == 0) {
						cash--;
						System.out.println("Bet lost"); // $1 lost
				} else {
						cash++;
						System.out.println("Bet won"); // $1 won
					}
		}
		System.out.println("Current cash is  " + cash);
		g.close();
	}
}
