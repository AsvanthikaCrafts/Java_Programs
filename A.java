class A
{
   class B
 {
    void inner()
   {
     System.out.println("inner class");
   }
 }

 public static void main(String args[])
 {
   A app = new A();
   app.outer();
   A.B s = new app.B();
 }

   void outer()
   {
     System.out.println("outer class");
   }
}