import java.io.*;
class insert
{
   int n;
   int a[]=new int[8];
  void input() throws Exception
  {
    DataInputStream f=new DataInputStream(System.in);
    System.out.println("ENTER THENO OF ELEMENTS:");
    n=Integer.parseInt(f.readLine());
     System.out.println("ENTER THe elements:");
    for(int i=0;i<n;i++)
     a[i]=Integer.parseInt(f.readLine());
   }
void out()
{
  int c,j;
  for(int i=1;i<n;i++)
   {
     c=a[i];
     for(j=i-1;j>=0 && a[j]>c;j--)
     {
       
       a[j+1]=a[j];
     
     }
       a[j+1]=c;
     }

    
   
}
void vijay()
{

System.out.println(" ELEMENTs are arranged:");
for(int i=0;i<n;i++)
    System.out.println(a[i]);

}

}
class m
{ 
  public static void main(String v[]) throws Exception
  {
    insert i1=new insert();
    i1.input();
    i1.out();
    i1.vijay();
  }
}   