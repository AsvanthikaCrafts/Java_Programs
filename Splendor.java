









class Bike
{
 void run()
 {
  System.out.println("running");
 }
}


class Splendor extends Bike
{
 void run()
 {
  Bike b=null;
  Splendor s = (Splendor)b;
  System.out.println("running safely"+" "+s);
 }
 void walk()
 {
 }
  public static void main(String args[])
  {
     Bike b = new Splendor();  
     b.run();
   
    Bike b2=null;
    Splendor s2 = (Splendor)b2;
    System.out.println("running safety"+" "+s2);
  }
}