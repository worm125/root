import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();
    if(n<0) {
      System.out.print("Invalid Input");
      System.exit(0);
    }
    int[] dhoniScores = new int[n];
    int[] baileyScores = new int[n];
    String[] matchType = new String[n+1];
    for(int i=0;i<n;i++) {
      dhoniScores[i] = sc.nextInt();
      if(dhoniScores[i]<0) {
        System.out.print("Invalid Input");
        System.exit(0);
      }
    }
    for(int i=0;i<n;i++) {
      baileyScores[i] = sc.nextInt();
      if(baileyScores[i]<0) {
        System.out.print("Invalid Input");
        System.exit(0);
      }
    }
    for(int i=0;i<=n;i++)
      matchType[i] = sc.nextLine();
    for(int i=0;i<n;i++) {
      if(dhoniScores[i]==baileyScores[i]) {
        if(matchType[i+1].equals("IPL"))
          System.out.print("SuperOver");
        else if(matchType[i+1].equals("T20"))
          System.out.print("BowlOut");
      }
      else if(dhoniScores[i]>baileyScores[i])
        System.out.print("Wins");
      else
        System.out.print("Looses");
    System.out.print("\n");
    }
  }
}
