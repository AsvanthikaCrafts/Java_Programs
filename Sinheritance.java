class Animal
{
 void eat(){
  System.out.println("eating");
  }
}

class Dog extends Animal
{
 void bark(){
  System.out.println("barking");
 }
}


class Sinheritance
{ 
 public static void main(String args[])
  {
   Dog a = new Dog();
    a.eat();
    a.bark();
  }
}
  