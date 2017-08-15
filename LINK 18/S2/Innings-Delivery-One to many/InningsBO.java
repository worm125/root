import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class InningsBO {
	public  Innings createInnings(String data) {
    	String battingTeam = data.split(",")[1];
        Long inningsNumber = Long.parseLong(data.split(",")[0]);
        Innings innings = new Innings(inningsNumber , battingTeam);
        return innings;
    }
}
