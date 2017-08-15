  public class Outcome {
    private	String status;
	private String winnerTeam;
	
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getWinnerTeam() {
		return winnerTeam;
	}
	public void setWinnerTeam(String winnerTeam) {
		this.winnerTeam = winnerTeam;
	}


	
	public Outcome(String status, String winnerTeam) {
	
		this.status = status;
		this.winnerTeam = winnerTeam;
	}


	public Outcome()
	{
	}
	
	public String toString()
	{
		return String.format("%-15s %-15s", status, winnerTeam);	
	}
}
