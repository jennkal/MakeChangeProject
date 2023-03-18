import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);

		System.out.println("What is the ammount of the item?");
		double amount = kb.nextDouble();
		
		System.out.println("how much money was tendered by customer?");
		double tender = kb.nextDouble();

		kb.close();
		
		double diff;
		int dollar = 0;
		int cents = 0;
		int hundred = 0;
		int fifty = 0;
		int twenty = 0;
		int ten = 0;
		int five = 0;
		int one = 0;
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int penny = 0;
		String result = "";
		
		if (tender == amount) {
			System.out.println("Ammount: " + amount + ", " + "Tendered: " + tender + ", " + "Result: Yay exact change.");
		}
		else if (tender < amount) {
			System.out.println("Ammount: " + amount + ", " + "Tendered: " + tender + ", " + "Result: Give me more money, Please.");
		}
		else if (tender > amount) {
			diff = tender - amount;
			dollar = (int)diff;
			cents = (int)((diff - (double)dollar) * 100);
			
			if (dollar >= 100) {
				hundred = dollar / 100;
				dollar = dollar % 100;
				result += hundred + " hundred dollar bill(s), ";
			}
			if (dollar >= 50) {
				fifty = dollar / 50;
				dollar = dollar % 50;
				result += fifty + " fifty dollar bill(s), ";
			}
			if (dollar >= 20) {
				twenty = dollar / 20;
				dollar = dollar % 20;
				result += twenty + " twenty dollar bill(s), ";
			}
			if (dollar >= 10) {
				ten = dollar / 10;
				dollar = dollar % 10;
				result += ten + " ten dollar bill(s), ";
			}
			if (dollar >= 5) {
				five = dollar / 5;
				dollar = dollar % 5;
				result += five + " five dollar bill(s), ";
			}
			if (dollar >= 1) {
				one = dollar / 1;
				dollar = dollar % 1;
				result += one + " one dollar bill(s), ";
			}
			if (cents >= 75) {
				quarter = cents / 25;
				cents = cents % 25;
				result += quarter + " quarter(s), ";
			}
			if (cents >= 10) {
				dime = cents / 10;
				cents = cents % 10;
				result += dime + " dime(s), ";
			}
			if (cents >= 5) {
				nickel = cents / 5;
				cents = cents % 5;
				result += nickel + " nickel(s), ";
			}
			if (cents >= 1) {
				penny = cents / 1;
				cents = cents % 1;
				result += penny + " penny(s).";
			}
			System.out.println("Amount: " + amount + "," + " Tendered: " + tender + "," + " Result: " + result);
		}
		// .99999999999 pennies
		// and 0.005
		// Math.round() goes to the closest value
		
	}

}
