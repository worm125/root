import java.util.Scanner;
import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, flag=0;
    n = sc.nextInt();
    if(n<0) {
      System.out.print("Invalid Input");
      System.exit(0);
    }
    Object[][] tableTeams = new Object[n][4];
    for(int i=0;i<n;i++) {
      for(int j=0;j<4;j++) {
        tableTeams[i][j] = sc.nextInt();
      }
    }
    for(int i=0;i<n;i++) {
      for(int j=i+1;j<n;j++) {
        if(Arrays.deepEquals(tableTeams[i], tableTeams[j])) {
          System.out.println((i+1) + "-" + (j+1));
          flag=1;
        }
      }
    }
    if(flag==0)
      System.out.println("None");
  }
}
