import java.util.Scanner;
class Main {

  public static void main(String[] args) 
   {
      Scanner s=new Scanner(System.in);
      System.out.print("ENTER THE NO OF ROWS:");
      int rows =s.nextInt();
      for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}