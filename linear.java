import java.io.*;
class linear
{
   int n,search,x;
   int a[]=new int[8];
  void input() throws Exception
  {
    DataInputStream f=new DataInputStream(System.in);
    System.out.println("ENTER THENO OF ELEMENTS:");
    n=Integer.parseInt(f.readLine());
     System.out.println("ENTER THe elements:");
    for(int i=0;i<n;i++)
     a[i]=Integer.parseInt(f.readLine());
    System.out.println("ENTER THE SEARCHING ELEMENT:");
    search=Integer.parseInt(f.readLine());
 }
void out()
{

  for(int i=0;i<n;i++)
  {
    if(a[i]==search)

     {
	System.out.println("THE SEARCHING ELEMENT is found:"); 
        x=1;
     }
}
    if(x==0)
    {
     System.out.println(" THE SEARCHING ELEMENT is not found:");
    }

}
}
class m
{ 
  public static void main(String v[]) throws Exception
  {
    linear l=new linear();
    l.input();
    l.out();
  }
}   