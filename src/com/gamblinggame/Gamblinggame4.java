package com.gamblinggame;

import java.util.Scanner;

public class Gamblinggame4 {

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
		int day = 1;
		int currentcash = 0;
		int totalWon = 0, gameswon = 0;
		int totalLoss = 0, gamesloss = 0;

		while (day < Days && bets < cash) {
			if (n == 0) {
				cash -= bets;
				System.out.println("Loose");
				System.out.println("Total Amount =" + cash);
				totalLoss++;
				gamesloss++;
				day++;

			} else {
				cash += bets;
				System.out.println("Won");
				System.out.println("Total Amount =" + cash);
				totalWon++;
				gameswon++;
				day++;
			}
			currentcash = totalWon > totalLoss ? totalWon - totalLoss : totalLoss - totalWon;
		}
		if (totalWon > totalLoss)
			System.out.println("Total cash Won for " + Days + " days is:" + currentcash);
		else
			System.out.println("Total cash Loss for " + Days + " days is:" + currentcash);
		g.close();
	}

}
