import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] teamA = new int[6];
    int[] teamB = new int[6];
    int rangeLower, rangeUpper;
    for(int i=0;i<6;i++)
    teamA[i] = sc.nextInt();
    for(int i=0;i<6;i++)
    teamB[i] = sc.nextInt();
    rangeLower = sc.nextInt();
    rangeUpper = sc.nextInt();
    int sumA=0, sumB=0;
    for(int i=rangeLower-1;i<rangeUpper;i++) {
        if(i<rangeUpper-1)  
          System.out.print(teamA[i] + " ");
        if(i==rangeUpper-1)
          System.out.print(teamA[i]);
    }
    System.out.print("\n");
    for(int i=rangeLower-1;i<rangeUpper;i++) {
      sumA += teamA[i];
      sumB += teamB[i];
      if(i<rangeUpper-1)  
          System.out.print(teamB[i] + " ");
      if(i==rangeUpper-1)
        System.out.print(teamB[i]); 
    }
    System.out.print("\n");
    if(sumA==sumB)
      System.out.print("Draw");
    else if(sumA<sumB)
      System.out.print("2");
    else
      System.out.print("1");
  }
}
