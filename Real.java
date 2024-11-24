interface Print
{
}

class A implements Print
{
 public void kaviya()
 {
  System.out.println("kaviya method");
 }
}

 class B implements Print
 {
  public void asvanthika()
  {
   System.out.println("asvanthika method");
  }
 }

class Call
{
 void phone(Print p)
 {
  if(p instanceof A)
  {
  A a = (A)p;
  a.kaviya();
  }

  
  if(p instanceof B)
  {
   B b = (B)p;
   b.asvanthika();
  }
 }
}



class Real
{
 public static void main(String args[])
 {
  Print p = new A();
  Call r = new Call();
  r.phone(p);
 }
}