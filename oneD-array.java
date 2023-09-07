import java.util.Scanner;
class oneD_array {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int i;
		System.out.println("Enter the size of the Array:");
		int n=s.nextInt();
		int[] arr = new int[50];
		
		System.out.println("Enter the Array elemenst:");
		for (i = 0; i <n; i++)
		{
			arr[i]=s.nextInt();	
		}
		System.out.println("The Array elements you entered are:");
		for (i = 0; i <n; i++)	
			System.out.print(arr[i]+" ");
	}
}
