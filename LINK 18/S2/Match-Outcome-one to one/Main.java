  import java.io.*;
import java.util.*;

 public class Main {

    public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String date;
		String teamOne; 
		String teamTwo; 
		String venue; 
	
		
		String status;
		String winnerTeam;
		
		

		System.out.println("Enter number of matches");
		Integer n=Integer.parseInt(br.readLine());
		Match match=new Match();
		Outcome outcome=new Outcome();
		ArrayList<Match> matchList = new ArrayList<Match>();

		
		
		
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter match "+(i+1)+" details:");
			
			System.out.println("Enter match date");
		        date=br.readLine();
			
			System.out.println("Enter team one");
			teamOne=br.readLine();
			
			System.out.println("Enter team two");
			teamTwo=br.readLine();
			
			System.out.println("Enter venue");
			venue=br.readLine();
			
			System.out.println("Enter status");
			status=br.readLine();
			
			System.out.println("Enter winner Team");
			winnerTeam=br.readLine();
			
			
			outcome=new Outcome(status,winnerTeam);	
			match=new Match(date,teamOne,teamTwo,venue,outcome);
			matchList.add(match);
			
			
		}

		MatchBO matchBO=new MatchBO();
		
		
		while(true)
		{
			System.out.println("Menu");
			System.out.println("1.View match details");
			System.out.println("2.Filter match details with outcome status");
			System.out.println("3.Filter match details with outcome winner team");
			System.out.println("4.Exit");
			
			System.out.println("Enter your choice");
			Integer choice=Integer.parseInt(br.readLine());
			
			switch(choice)
			{
			case 1:
				matchBO.printAllMatchDetails(matchList);
				break;
				
			case 2:
				System.out.println("Enter outcome status");
				 status=br.readLine();
				 matchBO.printMatchDetailsWithOutcomeStatus(matchList,status);
				 break;
			case 3:
				System.out.println("Enter outcome winner team");
				winnerTeam=br.readLine();
				matchBO.printMatchDetailsWithOutcomeWinnerTeam(matchList,winnerTeam);
				break;
				default:
					System.exit(0);
							
			
			}
			
			
		}

	}

}
