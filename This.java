class Student
{
 Student(){
   System.out.println();
  }
 
  Student(int x){
   this();
   System.out.println(x);
  }
}

class This
{
 public static void main(String args[])
 {
  Student p = new Student(5);
  }
}