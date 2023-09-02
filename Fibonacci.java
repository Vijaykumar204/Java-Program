import java.util.Scanner;
class fib
{
  public static void main(String[] args) 
   {

     int n , firstTerm = 0, secondTerm = 1;
     Scanner s=new Scanner(System.in);
     System.out.print("ENTER THE NO OF TERMS:");
     n=s.nextInt();
     System.out.println("Fibonacci Series till " + n + " terms:");
     for (int i = 1; i <= n; ++i)
     {
       System.out.print(firstTerm + ", ");
       int nextTerm = firstTerm + secondTerm;
       firstTerm = secondTerm;
       secondTerm = nextTerm;
    }
  }
}
