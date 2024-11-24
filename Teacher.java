class Student
{
 int rollno;
 String name,course;
 float fee;
 
 Student(int rollno,String name,String course){
  this.rollno=rollno;
  this.name=name;
  this.course=course;
 }

 
 Student(int rollno,String name,String course,float fee){
  this(rollno,name,course);
  this.fee=fee;
 }

 void display(){
  System.out.println(rollno+" "+name+" "+course+" "+fee);
 }
}

class Teacher
{
 public static void main(String args[])
 {
  Student s = new Student(11,"kaviya","java");
  Student s1 = new Student(11,"asvanthika","java",6000f);
  s.display();
  s1.display();
 }
}
 