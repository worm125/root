class MatchBO
{
    String team1 = "Team 1",team2 = "Team 2", date = "Date", venue = "Venue";
    Match match = new Match(date,team1,team2,venue);
    MatchBO(){}
    void displayAllMatchDetails(Match[] matchList)
    {
        System.out.println("Match Details");
        System.out.println(match.toString());
        for(int i=0 ; i<matchList.length ; i++){
            System.out.println(matchList[i].toString());
        }
    }
    void displaySpecificMatchDetails(Match[] matchList, String date)
    {
        System.out.println("Match Details");
        System.out.println(match.toString());
        for(int i=0 ; i<matchList.length ; i++){
            if((matchList[i].getDate()).equals(date)){
                System.out.println(matchList[i].toString());
            }
        }
    }
}
