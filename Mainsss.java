class Test<T>
{
 T obj;
 Test(T objs)
 {
 obj=objs;
 }
 public T getObject(){
 return obj;
 }
}

class Mainsss
{
 public static void main(String args[])
 {
  Test<Integer> iObj = new Test<Integer>(15);
  System.out.println(iObj.getObject());

  Test<String> sObj = new Test<String>("geeksforgeeks");
  System.out.println(sObj.getObject());
 }
}