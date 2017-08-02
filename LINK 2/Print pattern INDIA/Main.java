import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    char[] nameArr = name.toCharArray();
    int length = name.length();
    for(int i=0 ; i<length ; i++) {
      for(int j=0 ; j<=i ; j++) {
        System.out.print(nameArr[j]);
      }
    }
      System.out.print("\n");
  }
}
