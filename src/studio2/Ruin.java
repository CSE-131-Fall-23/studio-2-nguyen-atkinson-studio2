package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("The amount of money you started with: ");
		double startAmount= in.nextDouble();
		System.out.print("Win chance: ");
		double winChance= in.nextDouble();
		System.out.print("Win Limit: ");
		double winLimit= in.nextDouble();
		double totalSimulations = 0;
		double ruin=0;
	for (int days=1; days>=500; days++)
	{
		startAmount=startAmount;
		
		while(startAmount <= winLimit && startAmount > 0)	
	{
		System.out.println(" ");
		double winorloose= Math.random();
		totalSimulations++;
		if (winorloose < winChance)
		{
			//System.out.println("Win!");
			System.out.println("Simulation: " + totalSimulations);
			startAmount++;
		}
		else 
		{
			//System.out.println("Lose");
			System.out.println("Simulation: " + totalSimulations);
			ruin++;
			startAmount--;
		}
	}
	if (startAmount>= winLimit)
	{
		System.out.println("You won!");
	}
	else if (startAmount == 0)
	{
		System.out.println("You lost!");
	}
	System.out.println("Total simulations: " + totalSimulations);
	System.out.println("Ruin rate:" + ruin/totalSimulations);
	}
	if (winChance==0.5)
	{
	System.out.println("Expected ruin rate:" + (1-startAmount/winLimit));
	}
	else
		{
		double a = ((1-winChance)/winChance);
		System.out.println("Expected ruin rate:" + ((Math.pow(a,startAmount)-Math.pow(a, winLimit)))/((1-Math.pow(a,winLimit))));
	}
	
}
}

	
