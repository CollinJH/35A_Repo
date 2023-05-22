/* 
Collin      Hargreaves
CIS 35A          00441
Assignment           3
Due         05-21-2023
Submitted   05-21-2023
*/

import java.util.Arrays;

public class Store {
	private float salesbyweek[][];
	private float totalsalesbyweek[];
	private float avgsalesbyweek[];
	private float totalsalesforallweeks;
	private float avgweeklysales;
	private float weekwithhighestsales;
	private float weekwithlowestsales;

	// weeks of data [] and sales in a week []
	Store() {
		salesbyweek = new float[5][7];
		totalsalesbyweek = new float[5];
		avgsalesbyweek = new float[5];
	}

	// getter and setters
	// setsaleforweekdayintersection(int week, int day, float sale)
	public void setsaleforweekdayintersection(int week, int day, float sale) {
		salesbyweek[week][day] = sale;
	}

	// prints 2d array
	public void printdata() {
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 7; j++)
			{
				System.out.print(salesbyweek[i][j] + " ");
			}
			System.out.println("");
		}
	}
	// float [] getsalesforentireweek(int week)
	// float getsaleforweekdayintersection(int week, int day)
	// businessmethod

	// a. totalsalesforweek
	public void calctotalsalesbyweek() {
		for (int i = 0; i < 5; i++) {
			float sum = 0;
			for (int j = 0; j < 7; j++) {
				sum = sum + salesbyweek[i][j];
			}
			totalsalesbyweek[i] = sum;
		}
	}

	public void printTotalSalesByWeek() {
		System.out.printf("%s", "Total Sales by Week \n");
		System.out.printf(Arrays.toString(totalsalesbyweek));
		System.out.printf("\n");
	}

	// b. avgsalesforweek
	public void calcavgsalesbyweek() {

		for(int i = 0; i < 5; i++) {
			float sum = 0;
			for (int j = 0; j < 7; j++) {
				sum = sum + salesbyweek[i][j];
			}
			avgsalesbyweek[i] = sum / 7;
		}

	}
	
	public void printAvgSalesByWeek() {
		System.out.printf("%s", "Average Sales by Week \n");
		System.out.printf(Arrays.toString(avgsalesbyweek));
		System.out.printf("\n");
		
	}

	// c. totalsalesforallweeks
	public void calctotal() {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				totalsalesforallweeks = totalsalesforallweeks + salesbyweek[i][j];
			}
		}

	}

	public void printTotalSales() {
		System.out.printf("%s", "Total Sales For All Weeks \n");
		System.out.printf("%.2f%s", totalsalesforallweeks, "\n");
	}

	// d. averageweeklysales
	public void calcavgweeklysales() {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				avgweeklysales = avgweeklysales + salesbyweek[i][j];
			}
		}

		avgweeklysales = avgweeklysales / 5;

	}

	public void printAvgWeeklySales() {
		System.out.printf("%s", "Average Weekly Sales \n");
		System.out.printf("%.2f%s", avgweeklysales, "\n");
	}

	// e. weekwithhighestsaleamt
	public void calcweekwithhighestsales() {
		weekwithhighestsales = salesbyweek[0][0];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				if (salesbyweek[i][j] > weekwithhighestsales) {
					weekwithhighestsales = salesbyweek[i][j];
				}
			}
		}
	}

	public void printHighestSales() {
		System.out.printf("%s", "Week With Highest Sales \n");
		System.out.printf("%.2f%s", weekwithhighestsales, "\n");
	}

	// f. weekwithlowestsaleamt
	public void calcweekwithlowestsales() {
		weekwithlowestsales = salesbyweek[0][0];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				if (salesbyweek[i][j] < weekwithlowestsales) {
					weekwithlowestsales = salesbyweek[i][j];
				}
			}
		}
	}

	public void printLowestSales() {
		System.out.printf("%s", "Week With Lowest Sales \n");
		System.out.printf("%.2f%s", weekwithlowestsales, "\n");
	}

	// analyzeresults //call a through f
	public void analyzeresults() {
		calctotalsalesbyweek();
		calcavgsalesbyweek();
		calctotal();
		calcavgweeklysales();
		calcweekwithhighestsales();
		calcweekwithlowestsales();
	}

	public void printAll() {
		printTotalSalesByWeek();
		printAvgSalesByWeek();
		printTotalSales();
		printAvgWeeklySales();
		printHighestSales();
		printLowestSales();;
	}

	// print()
	public void print(int userChoice) {

		switch(userChoice) {
			case 1:
				printTotalSalesByWeek();
				break;
			case 2:
				printAvgSalesByWeek();
				break;
			case 3:
				printTotalSales();
				break;
			case 4:
				printAvgWeeklySales();
				break;
			case 5:
				printHighestSales();
				break;
			case 6:
				printLowestSales();
				break;
			case 7:
				printAll();
				break;
			case 8:
				printdata();
				break;
		}
		// write a switch statement for 1 - 8

		// 8 - print sales data
		// 1 - 6 calculated values
		// 7 print all 
	}
}
