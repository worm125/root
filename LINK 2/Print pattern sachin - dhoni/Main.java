import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    char[] nameArr = name.toCharArray();
    int length = name.length();
    for(int i=0 ; i<length ; i++) {
      for(int j=0 ; j<length ; j++) {
        if(i==0)
          System.out.print(nameArr[j]);
        else if(i==length-1)
          System.out.print(nameArr[length-1-j]);
        else {
          if(j==0)
            System.out.print(nameArr[i]);
          else if(j==length-1)
            System.out.print(nameArr[length-1-i]);
          else
            System.out.print("*");
        }
      }
      System.out.print("\n");
    }
  }
}
