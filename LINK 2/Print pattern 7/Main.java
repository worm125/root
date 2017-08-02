import java.util.Scanner;
public class Main {
  public static void print7(int row , int col) {
    for(int i=0 ; i<row ; i++) {
      for(int j=0 ; j<col ; j++) {
        if((i==0 && j%2==0)||(i==(col-1-j)))
          System.out.print("7");
        else
          System.out.print(".");
      }
      System.out.print("\n");
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = (m*2)-1;
    print7(m , n);
  }
}
