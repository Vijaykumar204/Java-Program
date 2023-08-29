import java.util.*;
class patternsearch
{
 public static void main(String v[])
 {
  String s,s1;
  int n,m,i,j,k,c=0;

   
     Scanner d=new Scanner(System.in);
     System.out.print("ENTER THE  STRING:");
     s=d.next();
     System.out.print("ENYER THE VALID PATTERN STRING:");
     s1=d.next();
     n=s.length();
     m=s1.length();
     if(n>m)
      {
        for(i=0;i<n;i++)
        {
          for(j=0,k=i;j<m&&k<n;j++)
           {
             if(s.charAt(k)==s1.charAt(j))
              {
                 k++;
		 c++;
              }
 	      else
	      {
                 break;
	      }
           }
        }
         
          if(i<=n)
          
              System.out.println("THE PATTERN IS EXIST");
          else
              System.out.println("THE PATTERN IS  NOT EXIST");
        
     }
  }
}
 
     