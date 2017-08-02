import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    int balls;
    Scanner sc = new Scanner(System.in);
    balls = sc.nextInt();
    if(balls<0) {
      System.out.println("Invalid Input");
      System.exit(0);
    }
    int[] hit = new int[balls];
    for(int i=0;i<balls;i++) {
      hit[i]=sc.nextInt();
      if(!(hit[i]==0 || hit[i]==1)){
        System.out.println("Invalid Input");
        System.exit(0);
      }
    }
    for(int i=0;i<balls;i++)
      System.out.println(hit[i]);
  }
}
