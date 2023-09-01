import java.io.*;

abstract class shape
{
 int l,b;
 abstract void printArea();
}
class rectangle extends shape
{
  void printArea() throws Exception
   {

     DataInputStream d=new DataInputStream(System.in);
     System.out.println("enter the length");
     l=Integer.parseInt(d.readLine());
     System.out.println("enter the breadth");
      b=Integer.parseInt(d.readLine());
  
     System.out.println("AREA OF RECTANGLE="+(l*b));
}
}
class triangle extends shape
{
   void printArea1() throws Exception
   {

     DataInputStream d=new DataInputStream(System.in);
     System.out.println("enter the length");
     l=Integer.parseInt(d.readLine());
     System.out.println("enter the height");
      b=Integer.parseInt(d.readLine());
     
     System.out.println("AREA OF TRIANGLE="+(0.5f*l*b));
}
}
class circle extends shape
{
   void printArea2() throws Exception
   {

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
  t.printArea1();
  circle c=new circle();
  c.printArea2();  
}
}