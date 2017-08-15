import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class DeliveryBO
{
    public Delivery createDelivery(String data,Innings[] inningsList) {
    String battingTeam = "";
    Long deliveryNumber = Long.parseLong(data.split(",")[0]);
    Long runs = Long.parseLong(data.split(",")[3]);
    Long inningsNumber = Long.parseLong(data.split(",")[4]);
    String batsman = data.split(",")[1];
    String bowler = data.split(",")[2];
    for(int i=0 ; i<inningsList.length ; i++){
        if((inningsList[i].getInningsNumber()).equals(inningsNumber))
            battingTeam = inningsList[i].getBattingTeam();
    }
    Innings innings = new Innings(inningsNumber, battingTeam);
    Delivery delivery = new Delivery(deliveryNumber,batsman,bowler,runs,innings);
    return delivery;
    }


    public Long findInningsNumber(Delivery [] deliveryList, long deliveryNumber){
        Long inningsNumber = 0L;
        for(int i=0 ; i<deliveryList.length ; i++)
            if((deliveryList[i].getDeliveryNumber())==deliveryNumber)
                inningsNumber = deliveryList[i].getInnings().getInningsNumber();
        return inningsNumber;
    }
}
