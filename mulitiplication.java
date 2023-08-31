import java.util.*;
class multiplication
{  
public static void main(String args[]){  
int a[][]=new int[10][10];  
int b[][]=new int[10][10];
Scanner s=new Scanner(System.in);
int row,column;
System.out.print("ENTER THE MARTIX ROW:");
row=s.nextInt();
System.out.print("ENTER THE MATRIX COLUMN:");
column=s.nextInt();
int c[][]=new int[10][10];  
 System.out.println("EMNTER THE MATRIX-1");
for(int i=0;i<row;i++)
{  
    for(int j=0;j<column;j++)
    { 
          a[i][j]=s.nextInt();
     }
 }
System.out.println("ENTER THE MATRIX-2");	
for(int i=0;i<row;i++)
{  
    for(int j=0;j<column;j++)
    { 
          b[i][j]=s.nextInt();
     }
 }
System.out.println("MUTIPLICATION OF TWO MATRIX");
for(int i=0;i<row;i++)
{  
       for(int j=0;j<column;j++)
       {  
	c[i][j]=a[i][j]*b[i][j];  
	System.out.print(c[i][j]+" ");  
       }  
      System.out.println();
}    
}
} 