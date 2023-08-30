import java.io.*;
class selection
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
  int i,j,min,c;
  for(i=0;i<n;i++)
   {
    min=i;
     for(j=i+1;j<n;j++)
     {
       if(a[min]>a[j])

         min=j;
    }
   c=a[min];
a[min]=a[i];
a[i]=c;
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
    selection s=new selection();
    s.input();
    s.out();
    s.vijay();
  }
}   