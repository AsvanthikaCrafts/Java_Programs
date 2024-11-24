class Animal
{
 int x=40;
 void eat(){
  System.out.println("eating");
  }
}

class Dog extends Animal
{
 int p=30;
 void bark(){
  System.out.println("barking");
 }
}

class Cat extends Animal
{ 
  String n="kaviya";
  void meow(){
  System.out.println(n);
 }
}


class Hinheritance
{ 
 public static void main(String args[])
  {
   Cat a = new Cat();
   Dog b = new Dog();
    a.eat();
    b.eat();
    b.bark();
    a.meow();
    System.out.println(b.p);
  }
}
