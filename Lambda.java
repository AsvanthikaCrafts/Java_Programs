interface sample
{
 void test();
}


class Lambda
{
 public static void main(String args[])
 {
  sample sample1=()->{
    System.out.println("test");
  };
   sample1.test();
 }
}