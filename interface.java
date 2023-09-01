import java.io.*;

interface shape
{
 
 public void printArea();
}
class rectangle implements shape
{
  public void printArea() throws Exception
   {
     int l,b;
     DataInputStream d=new DataInputStream(System.in);
     System.out.println("enter the length");
     l=Integer.parseInt(d.readLine());
     System.out.println("enter the breadth");
      b=Integer.parseInt(d.readLine());
  
     System.out.println("AREA OF RECTANGLE="+(l*b));
}
}
class triangle implements shape
{
   public void printArea() throws Exception
   {
     int l,b;
     DataInputStream d=new DataInputStream(System.in);
     System.out.println("enter the length");
     l=Integer.parseInt(d.readLine());
     System.out.println("enter the height");
      b=Integer.parseInt(d.readLine());
     
     System.out.println("AREA OF TRIANGLE="+(0.5f*l*b));
}
}
class circle implements shape
{
   public void printArea() throws Exception
   {
      int l,b;
     DataInputStream d=new DataInputStream(System.in);
     System.out.println("enter the radius");
     l=Integer.parseInt(d.readLine());
     
    
     System.out.println("AREA OF CIRCLE="+(3.14f*l*l));
}
}
class m
{
 public static void main(String v[]) throws Exception
{
  rectangle r=new rectangle();
  r.printArea();
  triangle t=new triangle();
  t.printArea();
  circle c=new circle();
  c.printArea();  
}
}