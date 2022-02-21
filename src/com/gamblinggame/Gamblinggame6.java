package com.gamblinggame;

import java.util.Scanner;

public class Gamblinggame6 {

	public static void main(String[] args) {
		// input from user taken using scanner object
		Scanner g = new Scanner(System.in);

		// input from user for both stack value and bets value
		System.out.println("Enter stack of every day");
		int stake = g.nextInt();
		System.out.println("Enter bet of every day");
		int bets = g.nextInt();
		System.out.println("Enter no of days");
		int Days = g.nextInt();
		int cash = stake;
		int n = (int) Math.floor((Math.random() * 10) % 2);
		int unluckiestDay = 0, luckiestDay = 0;
		int currentcash = 0;
		int totalWon = 0, gameswon = 0, Wondays = 0;
		int totalLoss = 0, gamesloss = 0, Lossdays = 0;
		int result = cash + (50 % cash);
		int result1 = cash - (50 % cash);
		for (int i = 1; i <= Days; i++) {
			while (cash < result && cash > result1) {
				if (n == 0) {
					cash -= bets;
					System.out.println("Loose");
					System.out.println("Total Amount =" + cash);
					totalLoss++;
					gamesloss++;

				} else {
					cash += bets;
					System.out.println("Won");
					System.out.println("Total Amount =" + cash);
					totalWon++;
					gameswon++;
				}
				if (totalWon > totalLoss) {
					gameswon++;
					luckiestDay = i;
				} else {
					unluckiestDay = i;
				}
			}
		}
		System.out.println("Luckiest Day on " + luckiestDay + " day.");
		System.out.println("The Unluckiest Day on " + unluckiestDay + " day.");
		g.close();
	}

}
