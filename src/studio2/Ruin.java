package studio2;
import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your starting amount?") ;
		int startAmount = in.nextInt();
		int startAmountHold = startAmount;
		System.out.println("What is the win probabilty?") ;
		double winProb = in.nextDouble();
		System.out.println("What is your win limit?") ;
		int limitWin = in.nextInt();
		System.out.println("How many simulations would you like to run?") ;
		int totalSim = in.nextInt();
		int currentSim = 0;
		int lose = 0;
		int win = 0;
		int times = 0;
		while(currentSim < totalSim )
			{
			startAmount = startAmountHold; 
			currentSim++;
		while(startAmount != 0 && startAmount != limitWin)
			
		{
			times = 0;
			double prob = Math.random();
			double succeed = winProb - prob;
			if(succeed == 0)
			{
				
			}
			else if(succeed > 0)
			{
				startAmount++;
				times++;
			}
			else
			{
				startAmount--;
				times++;
			}
			
			
		}
		if(startAmount == 0)
		{
			lose++;
			System.out.println("Simulation " + currentSim + " is a lose and took " + times + " tries."); 
		}
		else
		{
			win++;
			System.out.println("Simulation " + currentSim + " is a win and took " + times + " tries.");
		}
			}
		double ruinRate = ((lose*10.0)/totalSim)/10.0; 
		double trueRuinRate = 0;
		double a = (1-winProb)/winProb;
		if(winProb == .5)
		{
			trueRuinRate = 1 - (((startAmountHold/10.0)/(limitWin*10.0))*100.0);
		}
		else 
		{
			trueRuinRate = (Math.pow(a, startAmountHold) - Math.pow(a, limitWin)) / (1-Math.pow(a, limitWin)); 
		}
		
		System.out.println("Losses: " + lose + " Simulations: " + totalSim); 
		System.out.println("Ruin rate from simulation: " + ruinRate + " The true ruin rate is: " + trueRuinRate );

	}

}
