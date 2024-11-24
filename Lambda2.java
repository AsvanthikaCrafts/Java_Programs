interface sum
{
  void run();
}
 
class Lambda2
{
 public static void main(String args[])
 {
   sum example = ()->{
    String a="Kaviya";
    System.out.println(a);

    String lowercase = a.toLowerCase();
    System.out.println("Lowercase" + lowercase);
     
    String uppercase = a.toUpperCase();
    System.out.println("Uppercase" + uppercase);
   };
    example.run();
 }
}
