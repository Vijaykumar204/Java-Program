import java.util.*;
    
class multidimensional 
{  
public static void main(String v[]){  
int a[][]=new int[10][10];  
Scanner s=new Scanner(System.in);
 int row,column;
System.out.print("ENTER THE MARTIX ROW:");
row=s.nextInt();
System.out.print("ENTER THE MATRIX COLUMN:");
column=s.nextInt();
System.out.println("EMNTER THE MATRIX");
for(int i=0;i<row;i++)
{  
    for(int j=0;j<column;j++)
    { 
          a[i][j]=s.nextInt();
     }
 }
for(int i=0;i<row;i++)
{  
    for(int j=0;j<column;j++)
    {  
	System.out.print(a[i][j]+" ");  
    }  
    System.out.println();//new line  
}   
}
}  