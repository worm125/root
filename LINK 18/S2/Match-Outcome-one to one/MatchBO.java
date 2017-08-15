  import java.util.*;
class MatchBO {
    
	public void printAllMatchDetails(List<Match> MatchList)
	{
		System.out.println("Match Details");
        System.out.format("%-15s %-15s %-15s %-15s %-15s %s\n","Date","Team1","Team2","Venue","Status","Winner");
        for(int i=0 ; i<MatchList.size() ; i++){
            System.out.println(MatchList.get(i).toString());
        }
		
	}
	
	

	public void printMatchDetailsWithOutcomeStatus(List<Match> MatchList, String outcomeStatus) {
		
	    System.out.println("Match Details");
        System.out.format("%-15s %-15s %-15s %-15s %-15s %s\n","Date","Team1","Team2","Venue","Status","Winner");
        for(int i=0 ; i<MatchList.size() ; i++){
            if((MatchList.get(i).outcome.getStatus()).equals(outcomeStatus))
            System.out.println(MatchList.get(i).toString());
        }	
		
	}
	
	public void printMatchDetailsWithOutcomeWinnerTeam(List<Match> MatchList, String outcomeWinnerTeam)
	{
        System.out.println("Match Details");
        System.out.format("%-15s %-15s %-15s %-15s %-15s %s\n","Date","Team1","Team2","Venue","Status","Winner");
		for(int i=0 ; i<MatchList.size() ; i++){
            if((MatchList.get(i).outcome.getWinnerTeam()).equals(outcomeWinnerTeam))
            System.out.println(MatchList.get(i).toString());
        }
	}
	

}
