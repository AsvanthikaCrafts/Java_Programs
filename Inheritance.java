class A
{
 void sum()
 {
   System.out.println("x");
 }

 static int sum(int x,int y)
 {
   return x+y;
 }
}


class B extends A
{
  void sum()
  {
    System.out.println("y");
  }

  static int sum(int x,int y)
  {
    return x+y;
  }
}
class Inheritance{
   public static void main(String[] args)
    {
      B b = new B();
      
      b.sum();
      int result = b.sum(30,50);
    }
     void parent()
     {
       super.sum();
       super.sum(10,20);
     }
}
}
   
  