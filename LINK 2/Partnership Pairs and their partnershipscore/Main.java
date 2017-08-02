import java.util.Scanner;
public class Main {
  public static void main(String[] args) throws Exception {
    int i,j;
    Scanner sc = new Scanner(System.in);
    int numOfPairs = sc.nextInt();
    if(numOfPairs<0) {
      System.out.println("Invalid Input");
      System.exit(0);
    }
    int totalLength = numOfPairs*3;
    String[] pairs = new String[totalLength*2];
    for(i=0;i<=totalLength;i++){
      pairs[i] = sc.nextLine();
    }
    int counter = 1;
    
    System.out.print("[");
    for(i=0;i<numOfPairs;i++) {
      System.out.print("[" + pairs[counter++] + ", " + pairs[counter++] + ", " + pairs[counter++] + "]");
      if(i<numOfPairs-1)
        System.out.print(", ");
    }
    System.out.print("]");
  }
}
