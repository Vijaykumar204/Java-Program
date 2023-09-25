import java.util.Scanner;
class smallestelement

 {  
    public static void main(String[] args) 
     {  
        int [] a = new int [10];  
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER THE NO OF ELEMNTS:");
	int n=s.nextInt();
        System.out.println("ENTER THE ARRAY ELEMENT:");
        for(int i=0;i<n;i++)
           a[i]=s.nextInt();
       
        int min = a[0];  
        for (int i = 0; i <n; i++)
        {  
           
           if(a[i] <min)  
               min = a[i];  
        }  
        System.out.println("Smallest element present in given array: " + min);  
    }  
}  