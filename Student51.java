//package kaviya;
 public class Student51
{
 private String name;
 
 public String getname(){
  return name; 
  }

 public void setname(String name){
  this.name=name;
  }
} 



class Test1
{
 public static void main(String args[])
 {
  Student51 s = new Student51();
Student51 s1 = new Student51();
   s.setname("kaviya");
   s.name="kaviya";
s1.name="asvanthika";
  System.out.println(s.getname());
  System.out.println(s.name+" "+s1.name);
 }
}



