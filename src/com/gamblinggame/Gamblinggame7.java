package com.gamblinggame;

import java.util.Scanner;

public class Gamblinggame7 {

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
		System.out.println("Enter no of Months");
		int month = g.nextInt();
		int i;
		int cash = stake;
		int n = (int) Math.floor((Math.random() * 10) % 2);
		int day = 1;
		int currentcash = 0;
		int totalWon = 0;
		int totalLoss = 0;
		switch (n) {
		case 0:
			for (i = 1; i <= month; i++) {
				while (day < Days && bets < cash) {
					if (n == 0) {
						cash -= bets;
						System.out.println("Loose");
						System.out.println("Total Amount =" + cash);
						totalLoss++;
						day++;

					}
				}
			}
			System.out.println("Continue for next month with the cash =" + cash);
			currentcash = totalWon > totalLoss ? totalWon - totalLoss : totalLoss - totalWon;
			if (totalWon < totalLoss)
				System.out.println("Total cash Loss for " + Days + " days is:" + currentcash);

			break;
		case 1:
			for (i = 1; i <= month; i++) {
				while (day < Days && bets < cash) {
					if (n == 1) {
						cash += bets;
						System.out.println("Won");
						System.out.println("Total Amount =" + cash);
						totalWon++;
						day++;

					}
				}

			}
			System.out.println("Stop for next month with the cash =" + cash);
			currentcash = totalWon > totalLoss ? totalWon - totalLoss : totalLoss - totalWon;
			if (totalWon > totalLoss)
				System.out.println("Total cash Won for " + Days + " days is:" + currentcash);
			break;
		}
		g.close();
	}

}
