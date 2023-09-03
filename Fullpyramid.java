import java.util.Scanner;	
class Main {

  public static void main(String[] args) 
  {
     
    int rows,k = 0;
    Scanner s=new Scanner(System.in);
    System.out.print("ENTER THE NO OF ROWS:");
    rows =s.nextInt();
    for (int i = 1; i <= rows; i++, k = 0) {
      for (int space = 1; space <= rows - i; space++) {
        System.out.print("  ");
      }

      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }

      System.out.println();
    }
  }
}