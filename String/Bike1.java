abstrack class Bike1
{
 abstract void run();
}
 
class Honda4 extends Bike1
{
 void run()
 {
 System.out.println("running safely");
 }
 public static void main(String args[])
 {
  Bike1 b = new Honda4();
   b.run();
  }
}