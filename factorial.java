import java.util.*;
class Factorial {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER THE FACTORIAL NUMBER:");
        int num=s.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            factorial = factorial * i;
            
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}