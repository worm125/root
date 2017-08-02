import java.util.Scanner;
public class Main {
  public static void printM(int height, int width) {
    for(int row = 0; row < height; row++) {
      for(int col = 0; col < width; col++) {
        if(col == 0 || col == width-1 || (((col == row+1 && row!=0) || (col == width-row-2&&row!=0)) && row <= height / 2))
          System.out.print("M");
        else
          System.out.print("*");
      }
      System.out.print("\n");
    }
}
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  printM(n , (n+2));
  }
}
