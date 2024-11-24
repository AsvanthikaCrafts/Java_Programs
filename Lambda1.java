interface sample
{
  void run();
}


class Lambda1
{
  public static void main(String args[])
  {
    sample sum =()->{
     int a=10;
     int b=20;
     int c=a+b;
     System.out.println(c);
    };
       sum.run();
   }
}



