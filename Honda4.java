interface Bike1
{
 static int a=10;
 void run();
}
 
interface Bike2 extends Bike1
{
 static int b=12;
 void runs();
}
 
class Honda4 implements Bike2
{00.
 public void run()
 {
 System.out.println("running safely"+" "+a);
 }
 public void runs()
 {
 System.out.println("running safely"+" "+b);
 }
 
 public static void main(String args[])
 {
  Honda4 b = new Honda4();
   b.run();
   b.runs();
  }
} 