import java.util.*;
class copyarray
 {    
    public static void main(String[] args)
    {         
        int a1[][] = new int[10][10];
        int a2[][] = new int[10][10];   
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
              a1[i][j]=s.nextInt();
        }
      } 
      
        for (int i = 0; i < row; i++)
        {     
             for(int j=0;j<column;j++)
             {
         
            a2[i][j] = a1[i][j];     
            }      
        } 
        System.out.println("ELEMENT THE ORIGINAL ARRAY:");
        for(int i=0;i<row;i++)
        {  
              for(int j=0;j<column;j++)
             {  
	   System.out.print(a1[i][j]+" ");  
             }  
            System.out.println();  
        }   
       System.out.println("ELEMENT THE NEW ARRAY ");    
       for(int i=0;i<row;i++)
        {  
                for(int j=0;j<column;j++)
                {  
	              System.out.print(a2[i][j]+" ");  
                }  
               System.out.println();  
        }   
    }    
}    