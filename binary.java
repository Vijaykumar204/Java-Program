import java.io.*;
class binary
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
  int c;
  for(int i=0;i<n-1;i++)
   {
     for(int j=0;j<n-1;j++)
     {
      if(a[j]>a[j+1])
     {
       c=a[j];
       a[j]=a[j+1];
       a[j+1]=c;
     }
    }
   
}
System.out.println(" ELEMENTs are arranged:");
for(int j=0;j<n;j++)
    System.out.println(a[j]);

}
void vijay()
{
  int start=0,end=n-1,mid;
  while(start<=end)
  {
    mid=(start+end)/2;
    if(a[mid]==search)
      break;
     else if(a[mid]>search)
     end=mid-1;
     else
       start=mid+1;
  }
if(start<=end)
System.out.println(" THE SEARCHING ELEMENT is found:");
else
System.out.println("THE SEARCHING ELEMENT is not found:");
}
}
class m
{ 
  public static void main(String v[]) throws Exception
  {
    binary b=new binary();
    b.input();
    b.out();
    b.vijay();
  }
}   