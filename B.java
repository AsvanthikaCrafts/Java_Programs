class A
{
 void sum()
 {
   System.out.println("a class");
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
    System.out.println("b class");
  }

  static int sum(int x,int y)
  {
    return x+y;
  }


   public static void main(String[] args)
    {
      B b = new B();
      
      b.sum();
      int result = b.sum(30,50);
System.out.println("result :"+result);
	b.parent();
    }
     void parent()
     {
       super.sum();
       System.out.println("A class result :"+super.sum(10,20));
     }

}
   
  