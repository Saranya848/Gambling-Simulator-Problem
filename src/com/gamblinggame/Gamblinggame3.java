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
		int bet = (int) Math.floor((Math.random() * 10) % 2);
		int cash = stake;
		/*
		 * do one gambler's ruin simulation As a Calculative Gambler if won or lost 50%
		 * of the stake, would resign for the day
		 * 
		 */
		// determining 50% results
		int result = cash + 50 % cash;
		int result1 = cash - 50 % cash;
		while (cash <= result && cash >= result1) {
			if (bet == 0) {
				System.out.println("Loose");
				cash -= 1;
				System.out.println("Amount =" + cash);
				
			} else {
				System.out.println("Won");
				cash += 1;
				System.out.println("Amount =" + cash);
			}

		}
		System.out.println("Total amount end of the day =" + cash);
		System.out.println("Player resign for the day");
		g.close();
	}

}
