class WicketBO 
{

public WicketBO(){}
void displayAllWicketDetails(Wicket[] wicketList)
        {
            System.out.println("Wicket Details");
            for(int i=0 ; i<wicketList.length ; i++){
                System.out.println("Wicket " + (i+1));
                System.out.println(wicketList[i].toString());
            }
		}


void displaySpecificWicketDetails(Wicket[] wicketList,String Type)
	{
        for(int i=0 ; i<wicketList.length ; i++){
            if((wicketList[i].getWicketType()).equals(Type)){
                System.out.println("Wicket " + (i+1));
                System.out.println(wicketList[i].toString());
            }
        }
	}
}

